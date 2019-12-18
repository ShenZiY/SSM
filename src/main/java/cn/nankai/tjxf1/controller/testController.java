package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.service.EnvInfoService;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

@Controller
public class testController {

    @Autowired
    BaseInfoService baseInfoService;
    @Autowired
    EnvInfoService envInfoService;


    @Autowired
    test test;
    @RequestMapping(value = "/downTemplate", method = RequestMethod.GET)
    public void downTemplate(HttpServletResponse response) {
        B5OuterInfo carInfo = test.selectB5O();
        List<B5OuterInfo> userList = new ArrayList<>();
        userList.add(carInfo);
        ExcelKit.$Export(B5OuterInfo.class, response).downXlsx(userList, true);

    }

    @RequestMapping(value = "/viewPdf", method = RequestMethod.POST)
    @ResponseBody
    public void viewPdf(@Param("accId") Integer accId) throws IOException, DocumentException {
        Map<String,Object> resultMap = new HashMap<String, Object>();
        BaseInfo baseInfo = baseInfoService.findBaseInfoByAccId(accId);
        EnvInfo envInfo = envInfoService.findEnvInfoByAccId(accId);
        System.out.println(baseInfo.toString());
        System.out.println(envInfo.toString());
        String dirFile = "D:/TJXFdata/Temp/" + accId;
        File file = new File(dirFile);
        if(!file.exists()){     //判断文件路径是否存在
            file.mkdirs();              //不存在创建新的文件
        }
        // 模板路径
        String templatePath = "D:/PDF/表A111.pdf";
        // 生成的新文件路径
        String newPDFPath = "D:/TJXFdata/Temp/" + accId+"/"+accId+".pdf";
        File file1=new File(newPDFPath);
        if(file1.exists()&&file1.isFile())
            file1.delete();
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
        /*return resultMap;*/
        Desktop desktop = Desktop.getDesktop();
        file = new File(newPDFPath);
        desktop.open(file);
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
        if(str!=null&&str.length()>1){
            return str.trim().substring(0,1);
        }else{
            return "";
        }
    }

    public static String handleMultiple(String str){
        if(str!=null&&str.length()>1){
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
}
