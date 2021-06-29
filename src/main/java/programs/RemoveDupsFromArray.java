package programs;

import java.util.Arrays;

/**
 * Created by rk0000 on 8/7/18.
 */
public class RemoveDupsFromArray {
    public static void main(String[] args) {
        int[] array = {17, 6, 78, 12, 21, 99, 6};
        int[] result = new int[array.length];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j <array.length-1; j++) {
                if(array[i] != array[j]) {
                    result[j] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
