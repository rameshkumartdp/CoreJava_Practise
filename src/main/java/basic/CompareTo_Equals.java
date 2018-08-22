package basic;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by rk0000 on 8/20/18.
 */
public class CompareTo_Equals {
    public static void main(String[] args) {
        Map<String, String> brokenMap = new TreeMap<>(
                                                        (String o1, String o2) -> {
                                                            return 0;
                                                        }
                                                     );

        brokenMap.put("a", "a");
        brokenMap.put("b", "b");
        System.out.println("size: " + brokenMap.size());
        System.out.println("content: " + brokenMap);
    }
}
