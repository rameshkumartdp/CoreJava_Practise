package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by rk0000 on 7/15/18.
 */
public class ConcurrentMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Tom");
        concurrentMap.put(2, "Jerry");
        concurrentMap.put(3, "Spike");
        Iterator itr = concurrentMap.keySet().iterator();
        while(itr.hasNext()) {
            int next = (Integer)itr.next();
            //System.out.println( next +" "+ concurrentMap.get(next));
            concurrentMap.put(4, "Jelly");
        }
        System.out.println("concurrentMap---->  "+concurrentMap);

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
