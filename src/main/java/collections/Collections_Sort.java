package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rk0000 on 6/8/18.
 */
public class Collections_Sort {

    public static void main(String[] args) {
        String[] str = {"Tom", "Jerry", "Spike"};
        List myList = Arrays.asList(str);
        Collections.sort(myList, String.CASE_INSENSITIVE_ORDER);
        System.out.println(myList);
        int[] val = {9, 8 ,23, 88, 5, 18};
        List newList = Arrays.asList(val);
        System.out.println(newList);
        Collections.sort(newList);
        System.out.println(newList);

    }
}
