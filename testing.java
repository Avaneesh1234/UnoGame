import java.io.*;
import java.awt.*;


public class testing {
    public static void main(String[] args) {
        File a = new File("Cards");
        File b = new File(a,"0.png");
        System.out.println(b.getAbsolutePath());
    }
}
