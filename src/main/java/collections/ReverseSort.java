package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rk0000 on 6/9/18.
 */
public class ReverseSort {
    public static void main(String[] args) {
        String[] val = {"tom", "jerry", "spike"};
        List myList = Arrays.asList(val);
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println(myList);

    }
}
