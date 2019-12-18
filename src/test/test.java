import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    private static final String FILE_NAME = "D:/PDF/表A111.pdf";

    public static void main(String[] args) {


        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;

        try {

           /* reader = new PdfReader("D:/PDF/表A12142.pdf");
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();
            System.out.println(form);
*/

            /*String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);*/
           /* String textFromPage = PdfTextExtractor.getTextFromPage()
            System.out.println(textFromPage);
*/
           /* PdfReader pdfReader = new PdfReader("D:/PDF/表A12142.pdf");
            AcroFields acroFields = pdfReader.getAcroFields();
            Map<String,AcroFields.Item> fields = acroFields.getFields();*/
            /*System.out.println(fields.size());
            for (Map.Entry<String, AcroFields.Item> entry : fields.entrySet()) {

                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

            }*/



            reader = new PdfReader("D:/PDF/表A12172.pdf");// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields fields = stamper.getAcroFields();


            Set<String> fldNames = fields.getFields().keySet();

            for (String fldName : fldNames) {
                System.out.println( fldName + ": " + fields.getField( fldName ) );
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
