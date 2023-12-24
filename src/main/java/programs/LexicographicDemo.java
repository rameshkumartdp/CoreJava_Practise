package programs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LexicographicDemo {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("abcd", "abdc", "abaa", "acbd");
        lexicoSearch(products, "ab");
    }

    static List<List<String>> lexicoSearch(List<String> products, String keyword) {
        Collections.sort(products);
        System.out.println(products);

        List<List<String>> result = new ArrayList<List<String>>();
        for(int i=0; i<keyword.length(); i++) {
            List<String> stringList = new ArrayList<>();
            for(int j=0; j<products.get(i).length(); j++) {
                if(keyword.equals(products.get(j).substring(0, i+1))) {
                    stringList.add(products.get(j));
                    //System.out.println(stringList);
                }
            }
            result.add(stringList);
        }
        System.out.println(result);

        return result;
    }
}
