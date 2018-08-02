package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class Palindrome {
    public static void main(String[] args) {
        int input = 12_3_21;
        int reverse = 0;
        while(input > 0) {
            reverse  = reverse*10 + input%10;
            input = input/10;
        }
        System.out.println(reverse);
    }
}
