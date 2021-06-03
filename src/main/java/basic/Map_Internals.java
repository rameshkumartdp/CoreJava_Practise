package basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rk0000 on 8/20/18.
 */
public class Map_Internals {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ea", "Ramesh");
        map.put("FB", "Kumar");
        System.out.println(map);
        System.out.println(map.put("Ea", "Kumar"));
        System.out.println(map);
        System.out.println("Ea".hashCode()+"   "+"FB".hashCode());
    }
}
