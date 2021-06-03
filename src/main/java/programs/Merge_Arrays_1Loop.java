package programs;

import java.util.Arrays;

/**
 * Created by Ramesh on 030 30.May.21.
 */
public class Merge_Arrays_1Loop {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = {40,50,60};
        int resultLength = array1.length+array2.length;
        int[] result = new int[resultLength];
        for(int i=0, j=0; i<resultLength; i++) {
            if(i<array1.length) {
                result[i] = array1[i];
            } else {
                result[i] = array2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
