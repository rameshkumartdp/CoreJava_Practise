package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_Resources_Demo {
    public static void main(String[] args) {
        String path = "D:\\My Docs\\Projects\\Projects\\Practise\\src\\main\\resources\\frequency.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str;
            while((str = br.readLine())!=null) {
                System.out.println(str);
            }
        } catch (IOException io) {
            System.out.println("In Try with resources ---> " + io.getMessage());
            //io.printStackTrace();
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String str;
            while((str = br.readLine())!=null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("In Normal Try ---> " + e.getMessage());
//            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("In finally ---> " + ex.getMessage());
            }
        }
    }
}
