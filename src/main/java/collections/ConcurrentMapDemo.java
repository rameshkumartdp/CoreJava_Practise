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
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Tom");
        map.put(2, "Jerry");
        map.put(3, "Spike");
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()) {
            int next = (Integer)itr.next();
            System.out.println( next +" "+ map.get(next));
            map.put(4, "Jelly");
        }
    }
}
