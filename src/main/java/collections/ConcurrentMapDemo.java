package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by rk0000 on 7/15/18.
 */
public class ConcurrentMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(5, "Tom");
        concurrentMap.put(2, "Jerry");
        concurrentMap.put(4, "Spike");
        Iterator itr = concurrentMap.keySet().iterator();
        while(itr.hasNext()) {
            int next = (Integer)itr.next();
            //System.out.println( next +" "+ concurrentMap.get(next));
            concurrentMap.put(3, "Jelly");
        }
        System.out.println("concurrentMap---->  "+concurrentMap);

        Map<Integer, String> resultMap = concurrentMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2, LinkedHashMap::new));

        System.out.println("result Map---->  " + resultMap);

        Map<Integer, String> resultMap1 = concurrentMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2, LinkedHashMap::new));

        System.out.println("result Map1---->  " + resultMap1);

        Map<Integer, String> resultMap2 = concurrentMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2, LinkedHashMap::new));

        System.out.println("result Map2---->  " + resultMap2);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tom");
        map.put(2, "Jerry");
        map.put(3, "Spike");
        Iterator itr1 = map.keySet().iterator();
        while(itr1.hasNext()) {
            int next = (Integer)itr1.next();
            //System.out.println( next +" "+ map.get(next));
            //map.put(4, "Tyke");
            if(next==3) {
                map.put(5, "Toodles");
            }

        }
        System.out.println("map------->  "+map);
    }
}
