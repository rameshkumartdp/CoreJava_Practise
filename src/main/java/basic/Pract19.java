package basic;

import java.io.FileInputStream;

public class Pract19 {
    public static void main(String args[]) {
        FileInputStream fis;
        try {
            fis = new FileInputStream("abc.txt");
        }
        catch(Exception e) {  }
        finally {
            try {
                //fis.close();
            } catch(Exception e) { }
        }
    }
}
