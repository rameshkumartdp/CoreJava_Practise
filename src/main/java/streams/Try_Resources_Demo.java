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
            io.printStackTrace();
        }
    }
}
