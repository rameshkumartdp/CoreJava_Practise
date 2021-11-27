import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ramesh on 026 26.Sep.21.
 */
public class Java8Map {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Tom");
        myMap.put(2, "Jerry");
        myMap.put(3, "Spike");
        myMap.put(4, "Quacker");
        myMap.put(5, "Butch");
        System.out.println("Original map--->  "+myMap);

        Map<Integer, String> sortedMap = myMap.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.comparingByValue())
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
        System.out.println("Sorted map---->  "+sortedMap);

        Map<Integer, String> reverseSortedMap = myMap.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
        System.out.println("Reverse Sorted map---->  "+reverseSortedMap);

        List<String> myList = Arrays.asList("Red", "Green", "Blue");
        Map<String, Integer> listToMap = myList.stream().collect(Collectors.toMap(Function.identity(), str->str.length()));
        System.out.println("List to map--->  " +listToMap );
    }
}
