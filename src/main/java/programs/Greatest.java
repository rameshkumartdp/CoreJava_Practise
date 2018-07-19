package programs;

/**
 * Created by rk0000 on 7/19/18.
 */
public class Greatest {
    public static void main(String[] args) {
        int[] number = {5,7,22,1,9};
        int first = number[0];
        for(int i=0; i<number.length; i++) {
            if(number[i] > first) {
                first = number[i];
                System.out.println(first);
            }
        }
        System.out.println(first);

        System.out.println(10%2);

    }
}
