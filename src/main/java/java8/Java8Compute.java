package java8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by Ramesh on 005 05.Jun.21.
 */
public class Java8Compute {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("apple", 1);
        map.put("orange", 1);
        map.compute("apple", (k,v) -> v == null ? v : v+1);
        System.out.println(map);

        Map<String, LongAdder> map1 = new ConcurrentHashMap<>();
        map1.computeIfAbsent("orange", key -> new LongAdder()).increment();
        System.out.println(map1);

        Map<String, LongAdder> map2 = new ConcurrentHashMap<>();
        map2.put("apple" , new LongAdder());
        map2.computeIfPresent("apple", (key, value) -> new LongAdder()).increment();
        System.out.println(map2);
    }
}
