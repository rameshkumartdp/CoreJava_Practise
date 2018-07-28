package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rk0000 on 6/9/18.
 */
public class ReverseSort {
    public static void main(String[] args) {
        List myList = Arrays.asList("tom", "jerry", "spike");
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println(myList);
    }
}
