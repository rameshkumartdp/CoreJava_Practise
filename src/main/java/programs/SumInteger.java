package programs;

/**
 * Created by rk0000 on 7/29/18.
 */
public class SumInteger {
    public static void main(String[] args) {
        int input = 12345;
        int sum = 0;
        while(input > 0) {
            sum = sum + input%10;
            input = input/10;
        }
        System.out.println(sum);
    }
}
