package programs;

import org.apache.commons.collections.map.HashedMap;

import java.util.*;

/**
 * Created by rk0000 on 8/8/18.
 */
public class CommonIn3Arrays {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);
        List<Integer> list3 = Arrays.asList(40, 50, 60, 70, 80);
        List<List<Integer>> result = Arrays.asList(list1, list2, list3);
        System.out.println(list1.getClass());
        Map<Integer, Integer> map = new HashedMap();
        for(int i=0; i<result.size(); i++) {
            for(int j=0; j<result.get(i).size(); j++) {
                int key = result.get(i).get(j);
                if(map.containsKey(key)) {
                    map.put(key, map.get(key)+1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        System.out.println(map);

        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());

//        for(Map.Entry<Integer, Integer> entry : list) {
//            if(entry.getValue() == result.size()) {
//                System.out.println(entry.getKey()+ "  "+entry.getValue());
//            }
//        }

//        list.forEach((Map.Entry<Integer, Integer> entry) -> System.out.println(entry.getKey()+ " "+entry.getValue()));

        list.stream().filter((Map.Entry<Integer, Integer> entry) -> entry.getValue()==result.size())
                     .forEach((Map.Entry<Integer, Integer> entry) -> System.out.println(entry.getKey()+"  "+entry.getValue()));

    }
}
