package util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Ramesh on 026 26.Sep.21.
 */
public class Java8ConcurrentMap {
    public static void main(String[] args) {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "apple");
        map.put("two", "banana");
        map.put("three", "mango");
        map.compute("two", (k, v) -> k.length()==5 ? "No" : "Yes");
        System.out.println("After compute--->  " + map);

        map.computeIfPresent("three", (k, v) -> k.length()==5 ? "No" : "Yes");
        System.out.println("After computeIfPresent--->  " + map);

        map.computeIfAbsent("four", (k) -> k.length()==5 ? "No" : "Yes");
        System.out.println("After computeIfAbsent--->  " + map);
    }
}
