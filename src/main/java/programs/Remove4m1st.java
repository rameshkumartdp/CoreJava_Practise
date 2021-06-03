package programs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ramesh on 003 03.Jun.21.
 */
public class Remove4m1st {
    public static void main(String[] args) {
        String str1 = "India is great";
        String str2 = "in";
        char[] carr1 = str1.toLowerCase().toCharArray();
        char[] carr2 = str2.toCharArray();
        for(int i=0; i<carr1.length; i++) {
            for(int j=0; j<carr2.length; j++) {
                if(carr1[i] != ' ' && carr1[i] == carr2[j]) {
                    carr1[i]='\u0000';
                }
            }
        }
        System.out.println(new String(carr1));
    }
}
