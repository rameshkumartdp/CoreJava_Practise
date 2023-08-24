import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8GroupingBy {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 3, 1, 4, 6, 5, 7, 8, 9, 1, 8);

        Map<Integer, List<Integer>> numbersMap = numberList.stream().collect(Collectors.groupingBy(Integer::intValue));
        System.out.println(numbersMap);

        List<Integer> list = numbersMap.values().stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> sortedList = numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);


        Map<Integer, Long> numbersMap1 = numberList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(numbersMap1);

        numbersMap1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Butch", "Toodles", "Tom");
        Map<Integer, List<String>> stringMap = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringMap);

        Map<String, List<String>> stringMap2 = stringList.stream().collect(Collectors.groupingBy(String::new));
        System.out.println(stringMap2);


        Map<String, Long> stringMap1 = stringList.stream().collect(Collectors.groupingBy(String::new, Collectors.counting()));
        System.out.println(stringMap1);
    }
}
