import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.entity.EnvInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.service.EnvInfoService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import org.springframework.beans.factory.annotation.Autowired;

public class Snippet {

    @Autowired
    BaseInfoService baseInfoService;
    @Autowired
    EnvInfoService envInfoService;

    BaseInfo baseInfo = baseInfoService.findBaseInfoByAccId(20195021);
    EnvInfo envInfo = envInfoService.findEnvInfoByAccId(20195021);
    // 利用模板生成pdf
    public  void fillTemplate() {
        // 模板路径
        String templatePath = "D:/PDF/表A.pdf";
        // 生成的新文件路径
        String newPDFPath = "D:/PDF/表A1.pdf";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        try {
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();
            form.setField("accId", baseInfo.getAccId().toString());
            form.setField("timeFind",handleDate(baseInfo.getTimeFind().toString()));
            form.setField("carNum",baseInfo.getCarNum().toString());
            form.setField("hurtNum",baseInfo.getHurtNum().toString());
            form.setField("locSheng",baseInfo.getLocSheng());
            form.setField("locShi",baseInfo.getLocShi());
            form.setField("locXian",baseInfo.getLocDetail());
            form.setField("locDetail",baseInfo.getLocDetail());
            form.setField("peopleNum",baseInfo.getPeopleNum().toString());
            form.setField("govCj",baseInfo.getGovCj());
            form.setField("govLr",baseInfo.getGovLr());
            form.setField("timePolice",handleDate(baseInfo.getTimePolice().toString()));
            form.setField("timeInvest",handleDate(baseInfo.getTimeInvest().toString()));
            form.setField("timeFiretru",handleDate(baseInfo.getTimeFiretru().toString()));
            form.setField("ambulance",handleMultiple(baseInfo.getAmbulance()));
            form.setField("state",handleMultiple(baseInfo.getState()));
            form.setField("fireTru",handleMultiple(baseInfo.getFireTru()));

            form.setField("location",handleMultiple(envInfo.getLocation()));
            form.setField("roadinfoCt",handleMultiple(envInfo.getRoadinfoCt()));
            form.setField("roadinfoPd",envInfo.getRoadinfoPd().toString());
            form.setField("roadinfoCz",handleMultiple(envInfo.getRoadinfoCz()));
            form.setField("roadinfoZk",handleMultiple(envInfo.getRoadinfoZk()));
            form.setField("roadinfoJk",handleMultiple(envInfo.getRoadinfoJk()));
            form.setField("weainfoTq",handleMultiple(envInfo.getWeainfoTq()));
            form.setField("weainfoFx",handleMultiple(envInfo.getWeainfoFx()));
            form.setField("weainfoFl",handleMultiple(envInfo.getWeainfoFl()));
            form.setField("weainfoFs",envInfo.getWeainfoFs().toString());
            form.setField("weainfoWd",envInfo.getWeainfoWd().toString());
            form.setField("protectXc",handleMultiple(envInfo.getProtectXc()));
            form.setField("protectCl",handleMultiple(envInfo.getProtectCl()));


            /*String[] str = { "123456789", "TOP__ONE", "男", "1991-01-01", "130222111133338888", "河北省保定市" };*/
            /*int i = 0;*/
            java.util.Iterator<String> it = form.getFields().keySet().iterator();
            /*while (it.hasNext()) {
                String name = it.next().toString();
                System.out.println(name);
                *//*form.setField(name, str[i++]);*//*
            }*/
            stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();

            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();

        } catch (IOException e) {
            System.out.println(1);
        } catch (DocumentException e) {
            System.out.println(2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public static String handleDate (String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = sdf.parse(str);
        String formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
        return formatDate;
    }

    public static String handleMultiple(String str){
        if(str!=null&&str.length()>1){
            return str.trim().substring(0,1);
        }else{
            return "";
        }
    }

    public static void main(String[] args) {

    }
}
