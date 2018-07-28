package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rk0000 on 7/20/18.
 */
public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < array.length-1; i++)  {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i] == array[j]) ) {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
    }
}
