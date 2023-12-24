package java8;

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

        List<String> fruitList = Arrays.asList("Apple", "Banana", "Jackfruit");
        Map<String, Integer> fruitMap = fruitList.stream().collect(Collectors.toMap(k -> k.toUpperCase(), v -> v.length()));
        System.out.println("fruitMap--->  " +fruitMap );

        Map<String, Integer> modFruitMap = fruitList.stream().collect(Collectors.toMap(k -> k.toUpperCase(), v -> v.length(), (k,v) -> k.hashCode()+v.hashCode(), TreeMap::new));
        System.out.println("modFruitMap--->  " +modFruitMap );


        String fileText = "Hello Ramesh " +
                          "Welcome to JAVA " +
                          "Have a nice Day Ramesh " +
                          "Welcome Others   ";
        String[] searchItems = new String[] {"Ramesh", "Hello"};

        Map<String, Integer> fileMap = new HashMap<>();
        Arrays.stream(searchItems).forEach(k -> fileMap.put(k, 0));
        System.out.println(fileMap);

        Arrays.stream(fileText.split(" ")).forEach(word -> fileMap.computeIfPresent(word, (k,v) -> v+1));
        System.out.println(fileMap);

        Map<String, Integer> fileMap1 = new HashMap<>();
        Arrays.stream(fileText.split(" ")).forEach(word -> fileMap1.merge(word, 1, Integer::sum));
        System.out.println(fileMap1);

        Map<String, Integer> fileMap2 = new HashMap<>();
        Arrays.stream(fileText.split(" ")).forEach(word -> fileMap2.computeIfAbsent(word, k -> k.length()));
        System.out.println(fileMap2);

    }
}
