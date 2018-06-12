package basic;

import java.util.StringTokenizer;

/**
 * Created by rk0000 on 6/13/18.
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Welome@to&JAVA#Ramesh^!!!";
        StringTokenizer st = new StringTokenizer(str,"@,&,#,^");
        while(st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}
