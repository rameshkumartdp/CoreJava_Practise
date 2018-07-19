package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(10));
    }

    public static int getFactorial(int number) {
        if(number <= 0) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
