package basic;

import java.util.Random;

/**
 * Created by rk0000 on 6/13/18.
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rdm = new Random(150);
        for(int i=0; i<=5; i++) {
            System.out.println(rdm.nextInt());
        }
    }
}
