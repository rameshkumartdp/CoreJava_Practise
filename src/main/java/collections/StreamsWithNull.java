package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rk0000 on 7/28/18.
 */
public class StreamsWithNull {
    public static void main(String[] args) {
        List myList = Arrays.asList(1, null, 20, 50, null, 90);
        System.out.println(myList);

        List result = (List) myList.stream()
                                    .filter(value -> value!=null)
                                    .collect(Collectors.toList());
        System.out.println(result);
    }
}
