import java.awt.*;
import java.io.File;
import java.io.IOException;

public class pdftest {
    public static void main(String args[]) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file = new File("D:\\TJXFdata\\20195133\\20195133.pdf");
        desktop.open(file);

    }

}
