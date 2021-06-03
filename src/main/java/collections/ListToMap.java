package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ramesh on 004 04.Jun.21.
 */
public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Ramesh");
        list.add("Welcome");
        list.add("JAVA");

        Map<String, Integer> map = list.stream()
                                       .filter(str -> str.startsWith("R"))
                                       .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);
    }
}
