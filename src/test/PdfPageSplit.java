import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class PdfPageSplit {
    public static void main(String[] args) {

        // https://pdfbox.apache.org/download.cgi
        // pdfbox-2.0.8
        // fontbox-2.0.8.jar
        String dir = "D:\\TJXFdata\\Merge\\20195224\\20195224.pdf";

        String filepath = "file/pdf_ja_multipages.pdf";
        File pdfFile = new File(dir);
        try {
            PDDocument pdDoc = PDDocument.load(pdfFile);
            int numberOfPages = pdDoc.getNumberOfPages();
            System.err.println("pdDoc.getNumberOfPages():" + numberOfPages);
            for (int n = 1; n <= numberOfPages; n++) {
                System.err.println("n:" + n);
                PDDocument doc = new PDDocument();
                PDPage page;
                page = (PDPage) pdDoc.getPage(n - 1);
                doc.addPage(page);
                File tempFile = File.createTempFile("test", "_" + n + ".pdf");
                System.err.println("tempFile:" + tempFile.getAbsolutePath());
                doc.save(tempFile);
                doc.close();
                System.err.println("saved!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
