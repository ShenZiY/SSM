package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.service.EnvInfoService;
import cn.nankai.tjxf1.service.pdfService;
import cn.nankai.tjxf1.service.test;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.*;
import com.wuwenze.poi.ExcelKit;
import com.itextpdf.text.pdf.fonts.*;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

@Controller
public class pdfController {

    @Autowired
    BaseInfoService baseInfoService;
    @Autowired
    EnvInfoService envInfoService;
    @Autowired
    pdfService  pdfService;



    @Autowired
    test test;
    @RequestMapping(value = "/downTemplate", method = RequestMethod.GET)
    public void downTemplate(HttpServletResponse response) {
        B5OuterInfo carInfo = test.selectB5O();
        List<B5OuterInfo> userList = new ArrayList<>();
        userList.add(carInfo);
        ExcelKit.$Export(B5OuterInfo.class, response).downXlsx(userList, true);

    }

    @RequestMapping(value = "/savePdf", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> savePdf(@Param("accId") Integer accId) throws IOException, DocumentException, ParseException {
        String newPDFPath = "D:/TJXFdata/Temp/" +accId+".pdf";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        reader = new PdfReader(newPDFPath);// 读取pdf模板
        bos = new ByteArrayOutputStream();
        stamper = new PdfStamper(reader, bos);
        AcroFields fields = stamper.getAcroFields();
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setAccId(accId);
        baseInfo.setTimeFind(reHandleDate(fields.getField("timeFind")));
        baseInfo.setTimePolice(reHandleDate(fields.getField("timePolice")));
        baseInfo.setTimeInvest(reHandleDate(fields.getField("timeInvest")));
        baseInfo.setCarNum(Integer.parseInt(fields.getField("carNum")));
        baseInfo.setHurtNum(Integer.parseInt(fields.getField("hurtNum")));
        baseInfo.setPeopleNum(Integer.parseInt(fields.getField("peopleNum")));
        baseInfo.setGovLr(fields.getField("govLr"));
        baseInfo.setGovCj(fields.getField("govCj"));
        baseInfo.setAmbulance(fields.getField("ambulance"));
        baseInfo.setFireTru(fields.getField("fireTru"));
        if(fields.getField("ambulance")=="1"){
            baseInfo.setTimeAmbu(reHandleDate(fields.getField("timeAmbu")));
        }
        if(fields.getField("fireTru")=="1"){
            baseInfo.setTimeFiretru(reHandleDate(fields.getField("timeFiretru")));
        }
        if(fields.getField("state") == "8"){
            baseInfo.setState(fields.getField("state")+fields.getField("state1"));
        }else{
            baseInfo.setState(fields.getField("state"));
        }
        if(fields.getField("locSheng") == null || fields.getField("locSheng") == ""){
            baseInfo.setLocSheng(fields.getField("locShi"));
            baseInfo.setLocShi("市辖区");
        }else{
            baseInfo.setLocSheng(fields.getField("locSheng"));
            baseInfo.setLocShi(fields.getField("locShi"));
        }
        baseInfo.setLocXian(fields.getField("locXian"));
        baseInfo.setLocDetail(fields.getField("locDetail"));
        int flag = baseInfoService.updateSelective(baseInfo);
        if(flag != 1){
            bos.close();
            Map<String,Object> resultMap = new HashMap<>();
            System.out.println("flag"+flag);
            resultMap.put("code", "1");
            return resultMap;
        }


        stamper.close();
        reader.close();
        bos.close();

        Map<String,Object> resultMap = new HashMap<>();



        System.out.println("flag"+flag);
        resultMap.put("code", "0");
        return resultMap;
    }

    @RequestMapping(value = "/viewPdf", method = RequestMethod.POST)
    @ResponseBody
    public void viewPdf(@Param("accId") Integer accId) throws IOException, DocumentException {
        Map<String,Object> resultMap = new HashMap<String, Object>();
        BaseInfo baseInfo = baseInfoService.findBaseInfoByAccId(accId);
        EnvInfo envInfo = envInfoService.findEnvInfoByAccId(accId);
        //表B公共部分
        EnvBurnInfo envBurnInfo = pdfService.envBurnInfoSelectAll(accId);
        FireLocInfo fireLocInfo = pdfService.fireLocInfoSelectAll(accId);
        CarInfo carInfo = pdfService.carInfoSelectAll(accId);
        Integer carType = carInfo.getCarType();

        String dirFile = "D:/TJXFdata/Temp/"+accId+"/";
        String dirFileMerge = "D:/TJXFdata/Merge/"+accId+"/";
        File file = new File(dirFile);
        File fileMerge = new File(dirFileMerge);
        if(!file.exists()){     //判断文件路径是否存在
            file.mkdirs();              //不存在创建新的文件
        }
        if(!fileMerge.exists()){     //判断文件路径是否存在
            fileMerge.mkdirs();              //不存在创建新的文件
        }
        // 模板路径
        String templatePath = "D:\\新桌面\\毕设\\PDF\\template\\表A111.pdf";
        String templatePathB1 = "D:\\新桌面\\毕设\\PDF\\template\\表B1.pdf";
        // 生成的新文件路径
        String newPDFPath = "D:/TJXFdata/Temp/" +accId+"/"+accId+"A.pdf";
        String newPDFPathB1 = "D:/TJXFdata/Temp/" +accId+"/" +accId+"B1.pdf";
        File[] fs = file.listFiles();
        File[] fsMerge = fileMerge.listFiles();
        for (File f:fs) {
            if(f.exists()&&f.isFile())
                f.delete();
        }
        for (File f:fsMerge) {
            if(f.exists()&&f.isFile())
                f.delete();
        }
       /* File file1=new File(newPDFPath);
        if(file1.exists()&&file1.isFile())
            file1.delete();*/
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        BaseFont bf = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);


        try {
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields s = stamper.getAcroFields();
            int i = 1;
            for (Iterator it = s.getFields().keySet().iterator(); it.hasNext(); i++) {
                String name = (String) it.next();
                String value = s.getField(name);
                s.setFieldProperty(""+name.trim(),"textfont",bf,null);
            }
            AcroFields form = stamper.getAcroFields();
            form.setField("accId", baseInfo.getAccId().toString());
            form.setField("timeFind",handleDate(baseInfo.getTimeFind().toString()));
            form.setField("carNum",baseInfo.getCarNum().toString());
            form.setField("hurtNum",baseInfo.getHurtNum().toString());
            if(baseInfo.getLocShi().equals("市辖区")||baseInfo.getLocShi().equals("县")){
                form.setField("locShi",baseInfo.getLocSheng());
            }else{
                form.setField("locSheng",baseInfo.getLocSheng());
                String shi = baseInfo.getLocShi();
                form.setField("locShi",shi);
            }
            String xian = baseInfo.getLocXian();
            form.setField("locXian",xian);
            form.setField("locDetail",baseInfo.getLocDetail());
            form.setField("peopleNum",baseInfo.getPeopleNum().toString());
            form.setField("govCj",baseInfo.getGovCj());
            form.setField("govLr",baseInfo.getGovLr());
            form.setField("timePolice",handleDate(baseInfo.getTimePolice().toString()));
            form.setField("timeInvest",handleDate(baseInfo.getTimeInvest().toString()));
            if(handleMultiple1(baseInfo.getFireTru()).equals("1")){
                form.setField("timeFiretru",handleDate(baseInfo.getTimeFiretru().toString()));
            }
            if(handleMultiple1(baseInfo.getAmbulance()).equals("1")){
                form.setField("timeAmbu",handleDate(baseInfo.getTimeAmbu().toString()));
            }
            form.setField("ambulance",handleMultiple1(baseInfo.getAmbulance()));
            String state = baseInfo.getState();
            if(state.charAt(0)=='8'){
                form.setField("state","8");
                form.setField("state1",state.substring(1,state.length()));
            }else{
                form.setField("state",handleMultiple1(baseInfo.getState()));
            }
            form.setField("fireTru",handleMultiple1(baseInfo.getFireTru()));
            String location = envInfo.getLocation();
            if(location.charAt(0)=='8'){
                form.setField("location","8");
                form.setField("location1",location.substring(1,location.length()));
            }else{
                form.setField("location",handleMultiple1(envInfo.getLocation()));
            }
            form.setField("roadinfoCt",handleMultiple1(envInfo.getRoadinfoCt()));
            form.setField("roadinfoPd",envInfo.getRoadinfoPd().toString());

            String roadinfoCz =envInfo.getRoadinfoCz();
            if(roadinfoCz.charAt(0)=='8'){
                form.setField("roadinfoCz","8");
                form.setField("roadinfoCz1",roadinfoCz.substring(1,roadinfoCz.length()));
            }else{
                form.setField("roadinfoCz",handleMultiple1(envInfo.getRoadinfoCz()));
            }
            String roadinfoZk = envInfo.getRoadinfoZk();
            if(roadinfoZk.charAt(0)=='8'){
                form.setField("roadinfoZk","8");
                form.setField("roadinfoZk1",roadinfoZk.substring(1,roadinfoZk.length()));
            }else{
                form.setField("roadinfoZk",handleMultiple1(envInfo.getRoadinfoZk()));
            }
            form.setField("roadinfoJk",handleMultiple1(envInfo.getRoadinfoJk()));
            String weainfoTq = envInfo.getWeainfoTq();
            if(weainfoTq.charAt(0)=='8'){
                form.setField("weainfoTq","8");

                form.setField("weainfoTq1",weainfoTq.substring(1,weainfoTq.length()));
            }else{
                form.setField("weainfoTq",handleMultiple1(envInfo.getWeainfoTq()));
            }

            form.setField("weainfoFx",handleMultiple1(envInfo.getWeainfoFx()));
            form.setField("weainfoFl",handleMultiple1(envInfo.getWeainfoFl()));
            form.setField("weainfoFs",envInfo.getWeainfoFs().toString());
            form.setField("weainfoWd","1");
            form.setField("weainfoWd1",envInfo.getWeainfoWd().toString());

            String protectXc = envInfo.getProtectXc();
            if(protectXc.charAt(0)=='8'){
                form.setField("protectXc","8");
                form.setField("protectXc1",protectXc.substring(1,protectXc.length()));
            }else{
                form.setField("protectXc",handleMultiple1(envInfo.getProtectXc()));
            }
            String protectCl = envInfo.getProtectCl();
            if(protectCl.charAt(0)=='8'){
                form.setField("protectCl","8");
                form.setField("protectCl1",protectCl.substring(1,protectCl.length()));
            }else{
                form.setField("protectCl",handleMultiple1(envInfo.getProtectCl()));
            }

            stamper.setFormFlattening(false);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();
           /* Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();*/
            reader.close();
            out.write(bos.toByteArray());
            bos.close();
            out.close();

        } catch (IOException e) {
            System.out.println(1);
        } catch (DocumentException e) {
            System.out.println(2);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(3);
        }
        //表B1
        if(carType == 1) {
            try {
                B1OuterInfo b1OuterInfo = pdfService.b1OuterInfoSelectAll(accId);
                B1InnerInfo b1InnerInfo = pdfService.b1InnerInfoSelectAll(accId);
                HashMap<String,Object> map = new HashMap<>();
                bianLi(carInfo,map);bianLi(fireLocInfo,map);bianLi(envBurnInfo,map);bianLi(b1InnerInfo,map);bianLi(b1OuterInfo,map);
                out = new FileOutputStream(newPDFPathB1);// 输出流
                reader = new PdfReader(templatePathB1);// 读取pdf模板
                bos = new ByteArrayOutputStream();
                stamper = new PdfStamper(reader, bos);
                AcroFields s = stamper.getAcroFields();
                int i = 1;
                for (Iterator it = s.getFields().keySet().iterator(); it.hasNext(); i++) {
                    String name = (String) it.next();
                    String value = s.getField(name);
                    s.setFieldProperty("" + name.trim(), "textfont", bf, null);
                    if(map.get("" + name.trim())!=null){
                        System.out.println("" + name.trim()+"的值为："+map.get("" + name.trim()).toString());
                        s.setField("" + name.trim(),map.get("" + name.trim()).toString());
                        if(map.get("registerTime")!=null){
                            s.setField("registerTime",handleDate(map.get("registerTime").toString()));
                        }
                        if(map.get("modifyTime")!=null){
                            s.setField("modifyTime",handleDate(map.get("modifyTime").toString()));
                        }
                        if(map.get("maintainTime")!=null){
                            s.setField("maintainTime",handleDate(map.get("maintainTime").toString()));
                        }
                        if(map.get("insuranceTime")!=null){
                            s.setField("insuranceTime",handleDate(map.get("insuranceTime").toString()));
                        }
                        if(map.get("state")!=null){
                            s.setField("state",handleMultiple1(map.get("state").toString()));
                        }
                        if(map.get("aftloc")!=null){
                            String aft = map.get("aftloc").toString();
                            if(aft.charAt(0)=='2'){
                                s.setField("aftloc","2");
                                s.setField("aftloc2",aft.substring(1,aft.length()));
                            }else if(aft.charAt(0)=='8'){
                                s.setField("aftloc","8");
                                s.setField("aftloc8",aft.substring(1,aft.length()));
                            }else{
                                s.setField("aftloc","1");
                            }
                        }
                        if(map.get("transMethod")!=null){
                            String trans = map.get("transMethod").toString();
                            if(trans.charAt(0)=='8'){
                                s.setField("transMethod","8");
                                s.setField("transMethod8",trans.substring(1,trans.length()));
                            }else{
                                s.setField("transMethod",trans.substring(0,1));
                            }
                        }
                        if(map.get("ifModify")!=null){
                            String ifModify = map.get("ifModify").toString();
                            if(ifModify.charAt(0)=='8'){
                                s.setField("ifModify","8");
                                s.setField("ifModify8",ifModify.substring(1,ifModify.length()));
                            }else{
                                s.setField("ifModify",ifModify.substring(0,1));
                            }
                        }
                        if(map.get("maintainPurpose")!=null){
                            String maintainPurpose = map.get("maintainPurpose").toString();
                            if(maintainPurpose.charAt(0)=='8'){
                                s.setField("maintainPurpose","8");
                                s.setField("maintainPurpose8",maintainPurpose.substring(1,maintainPurpose.length()));
                            }else{
                                s.setField("maintainPurpose",maintainPurpose.substring(0,1));
                            }
                        }
                        if(map.get("insurance")!=null){
                            String insurance = map.get("insurance").toString();
                            if(insurance.charAt(0)=='8'){
                                s.setField("insurance","8");
                                s.setField("insurance8",insurance.substring(1,insurance.length()));
                            }else{
                                s.setField("insurance",insurance.substring(0,1));
                            }
                        }
                        if(map.get("insuranceType")!=null){
                            String insuranceType = map.get("insuranceType").toString();
                            if(insuranceType.charAt(0)=='8'){
                                s.setField("insuranceType","8");
                                s.setField("insuranceType8",insuranceType.substring(1,insuranceType.length()));
                            }else{
                                s.setField("insuranceType",insuranceType.substring(0,1));
                            }
                        }
                        if(map.get("modifyPos")!=null){
                            String modifyPos = map.get("modifyPos").toString();
                            if(modifyPos.charAt(0)=='8'){
                                s.setField("modifyPos","8");
                                s.setField("modifyPos8",modifyPos.substring(1,modifyPos.length()));
                            }else{
                                s.setField("modifyPos",modifyPos.substring(0,1));
                            }
                        }
                        if(map.get("myqs")!=null){
                            String myqs = map.get("myqs").toString();
                            if(myqs.charAt(0)=='8'){
                                s.setField("myqs","8");
                                s.setField("myqs8",myqs.substring(1,myqs.length()));
                            }else{
                                s.setField("myqs",myqs.substring(0,1));
                            }
                        }
                        if(map.get("qhbw")!=null){
                            String qhbw = map.get("qhbw").toString();
                            if(qhbw.charAt(0)=='8'){
                                s.setField("qhbw","8");
                                s.setField("qhbw8",qhbw.substring(1,qhbw.length()));
                            }else{
                                s.setField("qhbw",qhbw.substring(0,1));
                            }
                        }
                        if(map.get("barryPos")!=null){
                            String barryPos = map.get("barryPos").toString();
                            if(barryPos.charAt(0)=='8'){
                                s.setField("barryPos","8");
                                s.setField("barryPos8",barryPos.substring(1,barryPos.length()));
                            }else{
                                s.setField("barryPos",barryPos.substring(0,1));
                            }
                        }
                        if(map.get("barryVol")!=null){
                            String barryVol = map.get("barryVol").toString();
                            if(barryVol.charAt(0)=='8'){
                                s.setField("barryVol","8");
                                s.setField("barryVol8",barryVol.substring(1,barryVol.length()));
                            }else{
                                s.setField("barryVol",barryVol.substring(0,1));
                            }
                        }
                        if(map.get("oiltankPos")!=null){
                            String oiltankPos = map.get("oiltankPos").toString();
                            if(oiltankPos.charAt(0)=='8'){
                                s.setField("oiltankPos","8");
                                s.setField("oiltankPos8",oiltankPos.substring(1,oiltankPos.length()));
                            }else{
                                s.setField("oiltankPos",oiltankPos.substring(0,1));
                            }
                        }
                        if(map.get("oiltankMaterial")!=null){
                            String oiltankMaterial = map.get("oiltankMaterial").toString();
                            if(oiltankMaterial.charAt(0)=='8'){
                                s.setField("oiltankMaterial","8");
                                s.setField("oiltankMaterial8",oiltankMaterial.substring(1,oiltankMaterial.length()));
                            }else{
                                s.setField("oiltankMaterial",oiltankMaterial.substring(0,1));
                            }
                        }
                        if(map.get("oiltankVol")!=null){
                            String oiltankVol = map.get("oiltankVol").toString();
                            if(oiltankVol.charAt(0)=='8'){
                                s.setField("oiltankVol","8");
                                s.setField("oiltankVol8",oiltankVol.substring(1,oiltankVol.length()));
                            }else{
                                s.setField("oiltankVol",oiltankVol.substring(0,1));
                            }
                        }
                        if(map.get("unit1Circurt")!=null){
                            String unit1Circurt = map.get("unit1Circurt").toString();
                            if(unit1Circurt.charAt(0)=='8'){
                                s.setField("unit1Circurt","8");
                                s.setField("unit1Circurt8",unit1Circurt.substring(1,unit1Circurt.length()));
                            }else{
                                s.setField("unit1Circurt",unit1Circurt.substring(0,1));
                            }
                        }
                        if(map.get("unit2Circurt")!=null){
                            String unit2Circurt = map.get("unit2Circurt").toString();
                            if(unit2Circurt.charAt(0)=='8'){
                                s.setField("unit2Circurt","8");
                                s.setField("unit2Circurt8",unit2Circurt.substring(1,unit2Circurt.length()));
                            }else{
                                s.setField("unit2Circurt",unit2Circurt.substring(0,1));
                            }
                        }
                        if(map.get("other1Circurt")!=null){
                            String other1Circurt = map.get("other1Circurt").toString();
                            if(other1Circurt.charAt(0)=='8'){
                                s.setField("other1Circurt","8");
                                s.setField("other1Circurt8",other1Circurt.substring(1,other1Circurt.length()));
                            }else{
                                s.setField("other1Circurt",other1Circurt.substring(0,1));
                            }
                        }
                        if(map.get("other2Circurt")!=null){
                            String other2Circurt = map.get("other2Circurt").toString();
                            if(other2Circurt.charAt(0)=='8'){
                                s.setField("other2Circurt","8");
                                s.setField("other2Circurt8",other2Circurt.substring(1,other2Circurt.length()));
                            }else{
                                s.setField("other2Circurt",other2Circurt.substring(0,1));
                            }
                        }
                    }
                }
                //开始向PDF中添加值
                //添加结束
                stamper.setFormFlattening(false);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
                stamper.close();
                out.write(bos.toByteArray());
                bos.close();
                reader.close();
                out.close();
            } catch (IOException e) {
                System.out.println(1);
            } catch (DocumentException e) {
                System.out.println(2);
            } /*catch (ParseException e) {
            e.printStackTrace();
        } */ catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println(3);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        resultMap.put("code", "0");
        /*return resultMap;*/
        Desktop desktop = Desktop.getDesktop();

        for (File f:fs) {
            desktop.open(f);
        }
    }

    @RequestMapping(value = "/generatePdf", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> generatePdf(@Param("accId") Integer accId) throws IOException, DocumentException {
        Map<String,Object> resultMap = new HashMap<String, Object>();
        BaseInfo baseInfo = baseInfoService.findBaseInfoByAccId(accId);
        EnvInfo envInfo = envInfoService.findEnvInfoByAccId(accId);
        System.out.println(baseInfo.toString());
        System.out.println(envInfo.toString());
        String dirFile = "D:/TJXFdata/" + accId;
        File file = new File(dirFile);
        if(!file.exists()){     //判断文件路径是否存在
            file.mkdirs();              //不存在创建新的文件
        }
        // 模板路径
        String templatePath = "D:/PDF/表A111.pdf";
        // 生成的新文件路径
        String newPDFPath = "D:/TJXFdata/" + accId+"/"+accId+".pdf";
        File file1=new File(newPDFPath);
        if(file1.exists()&&file1.isFile())
            file1.delete();

       /* String newPDFPath1 = "D:/TJXFdata/Temp/" +accId+".pdf";
        File file11=new File(newPDFPath1);
        if(file11.exists()&&file11.isFile())
            file11.delete();*/
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        BaseFont bf = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

        try {
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);

            Font FontChinese = new Font(bf, 11, Font.NORMAL);
            AcroFields s = stamper.getAcroFields();
            System.out.println("s: " + s);
            System.out.println("AcroFields: " + s.getFields());
            System.out.println("AcroFields.class: " + s.getFields().getClass());
            System.out.println("getSignatureNames: " + s.getSignatureNames());
            System.out.println("getSignatureNames: " + s.getTotalRevisions());
            System.out.println("s: " + s.getBlankSignatureNames());
            System.out.println("s: " + s.getFieldCache());
            System.out.println("s: " + s.getSubstitutionFonts());
            int i = 1;
            for (Iterator it = s.getFields().keySet().iterator(); it.hasNext(); i++) {
                String name = (String) it.next();
                String value = s.getField(name);
                System.out.println("[" + i + "- name:" + name + ", value: "+value+"]");
                s.setFieldProperty(""+name.trim(),"textfont",bf,null);
            }


            AcroFields form = stamper.getAcroFields();
            form.setField("accId", baseInfo.getAccId().toString());
            form.setField("timeFind",handleDate(baseInfo.getTimeFind().toString()));
            form.setField("carNum",baseInfo.getCarNum().toString());
            form.setField("hurtNum",baseInfo.getHurtNum().toString());

            if(baseInfo.getLocShi().equals("市辖区")||baseInfo.getLocShi().equals("县")){
                form.setField("locShi",baseInfo.getLocSheng());
            }else{
                form.setField("locSheng",baseInfo.getLocSheng());
                String shi = baseInfo.getLocShi();
                form.setField("locShi",shi.substring(0,shi.length()-1));
            }


            String xian = baseInfo.getLocXian();
            form.setField("locXian",xian.substring(0,xian.length()-1));
            form.setField("locDetail",baseInfo.getLocDetail());
            form.setField("peopleNum",baseInfo.getPeopleNum().toString());
            form.setField("govCj",baseInfo.getGovCj());
            form.setField("govLr",baseInfo.getGovLr());
            form.setField("timePolice",handleDate(baseInfo.getTimePolice().toString()));
            form.setField("timeInvest",handleDate(baseInfo.getTimeInvest().toString()));
            if(handleMultiple(baseInfo.getFireTru()).equals("①")){
                form.setField("timeFiretru",handleDate(baseInfo.getTimeFiretru().toString()));
            }
            if(handleMultiple(baseInfo.getAmbulance()).equals("①")){
                form.setField("timeAmbu",handleDate(baseInfo.getTimeAmbu().toString()));
            }
            form.setField("ambulance",handleMultiple(baseInfo.getAmbulance()));
            String state = baseInfo.getState();
            if(state.charAt(0)=='8'){
                form.setField("state","⑧");
                form.setField("state1",state.substring(1,state.length()));
            }else{
                form.setField("state",handleMultiple(baseInfo.getState()));
            }
            form.setField("fireTru",handleMultiple(baseInfo.getFireTru()));
            String location = envInfo.getLocation();
            if(location.charAt(0)=='8'){
                form.setField("location","⑧");
                form.setField("location1",location.substring(1,location.length()));
            }else{
                form.setField("location",handleMultiple(envInfo.getLocation()));
            }
            form.setField("roadinfoCt",handleMultiple(envInfo.getRoadinfoCt()));
            form.setField("roadinfoPd",envInfo.getRoadinfoPd().toString());

            String roadinfoCz =envInfo.getRoadinfoCz();
            if(roadinfoCz.charAt(0)=='8'){
                form.setField("roadinfoCz","⑧");
                form.setField("roadinfoCz1",roadinfoCz.substring(1,roadinfoCz.length()));
            }else{
                form.setField("roadinfoCz",handleMultiple(envInfo.getRoadinfoCz()));
            }
            String roadinfoZk = envInfo.getRoadinfoZk();
            if(roadinfoZk.charAt(0)=='8'){
                form.setField("roadinfoZk","⑧");
                form.setField("roadinfoZk1",roadinfoZk.substring(1,roadinfoZk.length()));
            }else{
                form.setField("roadinfoZk",handleMultiple(envInfo.getRoadinfoZk()));
            }
            form.setField("roadinfoJk",handleMultiple(envInfo.getRoadinfoJk()));
            String weainfoTq = envInfo.getWeainfoTq();
            if(weainfoTq.charAt(0)=='8'){
                form.setField("weainfoTq","⑧");

                form.setField("weainfoTq1",weainfoTq.substring(1,weainfoTq.length()));
            }else{
                form.setField("weainfoTq",handleMultiple(envInfo.getWeainfoTq()));
            }

            form.setField("weainfoFx",handleMultiple(envInfo.getWeainfoFx()));
            form.setField("weainfoFl",handleMultiple(envInfo.getWeainfoFl()));
            form.setField("weainfoFs",envInfo.getWeainfoFs().toString());
            form.setField("weainfoWd","①");
            form.setField("weainfoWd1",envInfo.getWeainfoWd().toString());

            String protectXc = envInfo.getProtectXc();
            if(protectXc.charAt(0)=='8'){
                form.setField("protectXc","⑧");
                form.setField("protectXc1",protectXc.substring(1,protectXc.length()));
            }else{
                form.setField("protectXc",handleMultiple(envInfo.getProtectXc()));
            }
            String protectCl = envInfo.getProtectCl();
            if(protectCl.charAt(0)=='8'){
                form.setField("protectCl","⑧");
                form.setField("protectCl1",protectCl.substring(1,protectCl.length()));
            }else{
                form.setField("protectCl",handleMultiple(envInfo.getProtectCl()));
            }

            stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();

           /* Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();*/


            out.write(bos.toByteArray());
            bos.close();
            out.close();

        } catch (IOException e) {
            System.out.println(1);
        } catch (DocumentException e) {
            System.out.println(2);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(3);
        }
        System.out.println("done");

        resultMap.put("code", "0");
        baseInfoService.updateStatus(1,accId);
        return resultMap;
    }

    public static String handleDate (String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = sdf.parse(str);
        String formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
        return formatDate;
    }

    public static String handleMultiple1(String str){
        if(str!=null){
            return str.trim().substring(0,1);
        }else{
            return "";
        }
    }

    public static Date reHandleDate (String str) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse(str);
        return date;
    }


    public static String handleMultiple(String str){
        if(str!=null){
            switch (str.trim().substring(0,1)){
                case "1": return "①";
                case "2": return "②";
                case "3": return "③";
                case "4": return "④";
                case "5": return "⑤" ;
                case "6": return "⑥" ;
                case "7": return "⑦" ;
                case "8": return "⑧" ;
                case "9": return "⑨" ;
            }

            return "";

        }else{
            return "";
        }
    }

    private void bianLi(Object obj,HashMap<String,Object> map){
        if (obj == null) return;
        Field[] fields = obj.getClass().getDeclaredFields();
        for(int i = 0 , len = fields.length; i < len; i++) {
            // 对于每个属性，获取属性名
            String varName = fields[i].getName();
            try {
                // 获取原来的访问控制权限
                boolean accessFlag = fields[i].isAccessible();
                // 修改访问控制权限
                fields[i].setAccessible(true);
                // 获取在对象f中属性fields[i]对应的对象中的变量
                Object o;
                try {
                    o = fields[i].get(obj);
                    if(!map.containsKey(varName)){
                        map.put(varName,o);
                    }
                    /*System.err.println("传入的对象中包含一个如下的变量：" + varName + " = " + o);*/
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // 恢复访问控制权限
                fields[i].setAccessible(accessFlag);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
    }


}
