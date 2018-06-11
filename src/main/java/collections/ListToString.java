package collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rk0000 on 6/8/18.
 */
public class ListToString {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("Tom", "Jerry", "Spike").toString().replaceAll("\\p{P}",""));
    }
}
