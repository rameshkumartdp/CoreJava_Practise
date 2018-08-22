package programs;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rk0000 on 8/7/18.
 */
public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "gigabyte";
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch:array) {
            map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> entry:map.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
