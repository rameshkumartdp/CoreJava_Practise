import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ramesh on 004 04.Jun.21.
 */
public class Java8Collectors {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Toodles", "Jerry");
        Set<String> set =  list.stream().collect(Collectors.toSet());
        System.out.println(set);

        Map<String, Integer> map = set.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);

        LinkedHashSet<String> linkedHashSet = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(linkedHashSet);

        String str = list.stream().filter(value -> value.startsWith("T")).collect(Collectors.joining(","));
        System.out.println(str);

        ConcurrentMap<String, Integer> concurrentHashMap = set.stream().collect(Collectors.toConcurrentMap(Function.identity(), String::length));
        System.out.println(concurrentHashMap);

        List<String> list1 = Arrays.asList("10", "20", "30", "40", "50");
        IntSummaryStatistics summaryStatistics = list1.stream().map(Integer::parseInt).collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println(summaryStatistics.getMax());

        List<Integer> peekList = list1.stream()
                                    .map(Integer::valueOf)
                                    .peek(e -> System.out.println("map--->  "+e))
                                    .filter(value -> value>20)
                                    .peek(e -> System.out.println("filter--->  "+e))
                                    .collect(Collectors.toList());
        System.out.println(peekList);

        Set<String> stringSet = Stream.of("Timon", "Pumba").collect(Collectors.toSet());
        System.out.println(stringSet);

        Map<Boolean, List<Integer>> map1 = list1.stream().map(Integer::valueOf).collect(Collectors.partitioningBy(val -> val%2==0));
        System.out.println(map1);

        long count = list.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
