package streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by rk0000 on 6/13/18.
 */
public class BufferReaderDemo {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("U entered "+str);
    }
}
