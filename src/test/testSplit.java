import cn.nankai.tjxf1.entity.BaseInfo;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class testSplit {

    public static void main(String[] args) throws IOException, DocumentException {

        int accId = 20195224;
        String dirFileMerge = "D:/TJXFdata/Merge/"+20195224+"/"+20195224+".pdf";
        String dirFileMerge1 = "D:/TJXFdata/Merge/"+20195224+"/";

        String dirFile = "D:/TJXFdata/Temp/"+20195224+"/";
        String dirFileA = "D:/TJXFdata/Temp/"+20195224+"/"+20195224+"total.pdf";
        String dirFileB = "D:/TJXFdata/Temp/"+20195224+"/"+20195224+"B.pdf";
        /*manipulatePdf(dirFileMerge1,dirFile,accId);*/


        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        reader = new PdfReader(dirFileA);// 读取pdf模板
        bos = new ByteArrayOutputStream();
        stamper = new PdfStamper(reader, bos);
        AcroFields fields = stamper.getAcroFields();
        System.out.println(fields.toString());
        BaseInfo baseInfo = new BaseInfo();
        Set<String> fldNames = fields.getFields().keySet();
        System.out.println(fldNames.size());
        for (String fldName : fldNames) {
            System.out.println( fldName + ": " + fields.getField( fldName ) );
        }
    }

    public static void manipulatePdf(String pathMerge,String path, Integer accId)
            throws IOException, DocumentException {
        Document document = new Document();
        String newPath = pathMerge +accId+ ".pdf";
        PdfCopy copy = new PdfCopy(document, new FileOutputStream(newPath));
        document.open();
        File file = new File(path);
        File[] fs = file.listFiles();
        for (File f:fs) {
            System.out.println(f.getAbsolutePath());
            PdfReader reader = new PdfReader(f.getAbsolutePath());
            copy.addDocument(reader);
            reader.close();
        }
        document.close();
    }
}
