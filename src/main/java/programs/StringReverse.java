package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rk0000 on 7/20/18.
 */
public class StringReverse {

    public String getReverse(String str) {
        String reverse = "";
        if(str.length()==1) {
            return str;
        } else {
            reverse += str.charAt(str.length()-1) + getReverse(str.substring(0,str.length()-1));
        }
        return reverse;
    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        for(int i=charArray.length-1; i>=0; i--) {
            System.out.print(str.charAt(i) + "");
        }
        return "";
    }

    public static String reverseSort(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        List<String> result = list.stream().map((String str1) -> new StringBuffer(str1).reverse().toString()).sorted().collect(Collectors.toList());
        System.out.println(result);

        return "";
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        //System.out.println(sr.getReverse("Ramesh Kumar"));
        //System.out.println(reverse("Ramesh Kumar"));
        System.out.println(reverseSort("Ramesh Kumar"));
    }
}
