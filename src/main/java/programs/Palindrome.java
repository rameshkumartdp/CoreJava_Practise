package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class Palindrome {
    public static void main(String[] args) {
        int number=87678, reverse=0, reminder=0;
        while(number>0) {
            reminder = number%10;
            reverse = reverse*10 + reminder;
            number = number/10;
            System.out.println(reminder+" "+reverse+" "+number);
        }
        System.out.println(number+" "+reverse);
    }
}
