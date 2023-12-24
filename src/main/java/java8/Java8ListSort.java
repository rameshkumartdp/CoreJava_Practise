package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Ramesh on 026 26.Oct.21.
 */
public class Java8ListSort {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(30, 20, 10, 40, 70, 60, 50, 80);
        List<Integer> output = myList.stream().filter(x -> x > 40).sorted().collect(Collectors.toList());
        System.out.println(output);

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "6");
        myMap.put(5, "2");
        myMap.put(3, "4");
        myMap.put(2, "5");
        myMap.put(4, "3");
        myMap.put(6, "1");
        System.out.println(myMap);

        Map<Integer, String> result = myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
        System.out.println(result);
    }
}
