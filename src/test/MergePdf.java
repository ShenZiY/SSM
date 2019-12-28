import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

import java.io.*;
import java.util.ArrayList;

public class MergePdf {
    /** 添加的. */
    public static final String COVER = "D:\\TJXFdata\\Temp\\20195224\\20195224A.pdf";
    /** 主pdf. */
    public static final String SRC =  "D:\\TJXFdata\\Temp\\20195224\\20195224B1.pdf";
    /** 存在哪. */
    public static final String DEST = "D:\\TJXFdata\\Temp\\20195224\\20195224.pdf";


    /*String dirFile = "D:/TJXFdata/Temp/"+accId+"/";*/

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


    public static void main(String[] args)
            throws IOException, DocumentException {
       /* String dirFileMerge = "D:/TJXFdata/Merge/20195224/20195224.pdf";
        PdfReader reader = new PdfReader(dirFileMerge);
        System.out.println(reader.getNumberOfPages());*/
       /* File file = new File(DEST);
        file.getParentFile().mkdirs();*/
        manipulatePdf("D:\\TJXFdata\\Temp\\test\\", "D:\\TJXFdata\\Temp\\20195224\\",20195224);//本地
        /*try {
           splitPDF(new FileInputStream("D:\\TJXFdata\\Temp\\20195224\\20195224.pdf"),
                    new FileOutputStream("D:\\TJXFdata\\Temp\\20195224\\output1.pdf"), 1, 1);
           splitPDF(new FileInputStream("D:\\TJXFdata\\Temp\\20195224\\20195224.pdf"),
                    new FileOutputStream("D:\\TJXFdata\\Temp\\20195224\\output2.pdf"), 2, 5);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*splitPDFFile("D:\\TJXFdata\\Temp\\20195224\\20195224.pdf","D:\\TJXFdata\\Temp\\20195224\\output1.pdf",1,1);
        splitPDFFile("D:\\TJXFdata\\Temp\\20195224\\20195224.pdf","D:\\TJXFdata\\Temp\\20195224\\output2.pdf",2,5);
*/


    }



    /**
     * 截取pdfFile的第from页至第end页，组成一个新的文件名
     * @param__pdfFile  需要分割的PDF
     * @param savepath  新PDF
     * @param from  起始页
     * @param end  结束页
     */
    public static void splitPDFFile(String respdfFile,
                                    String savepath, int from, int end) {
        Document document = null;
        PdfCopy copy = null;
        try {
            PdfReader reader = new PdfReader(respdfFile);
            int n = reader.getNumberOfPages();
            if(end==0){
                end = n;
            }
            ArrayList<String> savepaths = new ArrayList<String>();
            String staticpath = respdfFile.substring(0, respdfFile.lastIndexOf("\\")+1);
            //String savepath = staticpath+ newFile;
            savepaths.add(savepath);
            document = new Document(reader.getPageSize(1));
            copy = new PdfCopy(document, new FileOutputStream(savepaths.get(0)));
            document.open();
            for(int j=from; j<=end; j++) {
                document.newPage();
                PdfImportedPage page = copy.getImportedPage(reader, j);
                copy.addPage(page);
            }
            document.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch(DocumentException e) {
            e.printStackTrace();
        }
    }



}
