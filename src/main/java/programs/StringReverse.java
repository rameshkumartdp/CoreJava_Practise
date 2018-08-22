package programs;

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

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        System.out.println(sr.getReverse("Ramesh Kumar"));
    }
}
