package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class Swap {
    public static void main(String[] args) {
        int first =7, second = 9, temp;
        temp = first;
        first = second;
        second = temp;
        System.out.println(first+" "+second);

        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println(first+" "+second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first+" "+second);
    }
}
