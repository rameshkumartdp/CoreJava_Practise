package programs;

import java.util.Arrays;

/**
 * Created by rk0000 on 8/7/18.
 */
public class Merge_Arrays {
    public static void main(String[] args) {
        int[] array1 = {12,15,17,19};
        int[] array2 = {12,17,20,23};
        int[] result = new int[array1.length+array2.length];
        int count = 0;
        for(int i=0; i<array1.length; i++) {
            result[i] = array1[i];
            count++;
        }
        for(int i=0; i<array2.length; i++) {
            result[count++] = array2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
