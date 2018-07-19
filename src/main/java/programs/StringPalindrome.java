package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "hammer";
        char[] arr = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
