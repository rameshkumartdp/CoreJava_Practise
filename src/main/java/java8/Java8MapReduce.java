package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ramesh on 031 31.Aug.21.
 */
public class Java8MapReduce {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8);
        int sum = myList.stream().reduce((a, b) -> (a+b)).get();
        System.out.println(sum);

        int bigger = myList.stream().reduce((a,b) -> (a>b ? a : b)).get();
        System.out.println(bigger);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Ramesh", 132228);
        myMap.put("Tom", 5244);
        myMap.put("Jerry", 576);

        myMap.replaceAll((key, value) -> value>600 ? 1 : 0);
        System.out.println(myMap);

        myMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
