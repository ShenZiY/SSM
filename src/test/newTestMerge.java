import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class newTestMerge {
    public static void main(String[] args) throws IOException {

        //Loading an existing PDF document
        String dirFileA = "D:/TJXFdata/Temp/"+20195224+"/"+20195224+"A.pdf";
        String dirFileB = "D:/TJXFdata/Temp/"+20195224+"/"+20195224+"B.pdf";
        String dir = "D:/TJXFdata/Temp/"+20195224+"/"+20195224+"total.pdf";
        File file1 = new File(dirFileA);


        File file2 = new File(dirFileB);


        //Instantiating PDFMergerUtility class
        PDFMergerUtility PDFmerger = new PDFMergerUtility();

        //Setting the destination file
        PDFmerger.setDestinationFileName(dir);

        //adding the source files
        PDFmerger.addSource(file1);
        PDFmerger.addSource(file2);

        //Merging the two documents
        PDFmerger.mergeDocuments();
        System.out.println("Documents merged");
        //Closing the documents
    }

}
