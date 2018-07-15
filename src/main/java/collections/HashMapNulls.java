package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rk0000 on 7/15/18.
 */
public class HashMapNulls {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"Java");
        map.put(3,null);
        map.put(null, "Tom");
        map.keySet().removeAll(Collections.singleton(null));
        map.values().removeAll(Collections.singleton(null));
        System.out.println(map);
    }
}
