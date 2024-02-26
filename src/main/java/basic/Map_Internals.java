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

        String value = map.put("Name", "Ramesh");
        System.out.println(value);
        String value1 = map.put("Name", "Kumar");
        System.out.println(value1);

        Map<Integer, Integer> intMap = new HashMap<>();
        //int intVal = intMap.put(100, 5244);    NPE as Integer is NULL & cannot unbox to int
        Integer intVal = intMap.put(100, 5244);
        System.out.println(intVal);
        int intVal1 = intMap.put(100, 132228);
        System.out.println(intVal1);
        
    }
}
