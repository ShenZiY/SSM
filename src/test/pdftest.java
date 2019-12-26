import java.awt.*;
import java.io.File;
import java.io.IOException;

public class pdftest {
    public static void main(String args[]) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file = new File("D:\\新桌面\\毕设\\PDF\\表A.pdf");
        File file1 = new File("D:\\新桌面\\毕设\\PDF\\表B1.pdf");
        File file2 = new File("D:\\新桌面\\毕设\\PDF\\表B1-字段.pdf");
        desktop.open(file);
        desktop.open(file1);
        desktop.open(file2);

    }

}
