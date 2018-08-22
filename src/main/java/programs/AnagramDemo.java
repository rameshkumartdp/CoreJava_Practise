package programs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rk0000 on 8/10/18.
 */
public class AnagramDemo {
    public static void main(String[] args) {
        String str1 = "ramesh";
        String str2 = "shraem";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int anagram = 0;
        if(char1.length == char2.length) {
            for (int i=0; i < char1.length; i++) {
                for (int j=0; j < char2.length; j++) {
                    if (char1[i] == char2[j]) {
                        anagram++;
                    }
                }
            }
        }
        if(anagram == str1.length()) {
            System.out.println("ANAGRAM--->");
        } else {
            System.out.println("NON ANAGRAM--->");
        }
    }
}
