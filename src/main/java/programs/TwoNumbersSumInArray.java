package programs;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rk0000 on 8/7/18.
 */
public class TwoNumbersSumInArray {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 40, 20};
        int sum = 40;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]+array[j] == sum) {
                    System.out.println(array[i]+"  "+array[j]);
                }
            }
        }

        int total =0;
        Set<Integer> set = new HashSet<>();
        for(int number: array) {
            total = sum - number;
            if(!set.contains(total)) {
                set.add(number);
            } else {
                System.out.println(number+"  "+total);
            }
        }
    }
}
