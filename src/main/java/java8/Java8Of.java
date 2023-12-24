package java8;

import org.apache.kafka.common.protocol.types.Field;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Java8Of {
    public static void main(String[] args) {
        List<String> myList = List.of("Asia", "Europe", "Africa", "America");
        try {
            myList.add("Australia");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        try {
            myList.add(null);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        System.out.println(myList);

        Map<String, String> myMap = Map.of("India", "INR", "US", "USD", "Japan", "JPY");
        try {
            myMap.put("Singapore", "SGD");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        System.out.println(myMap);

        Map<String, String> myMap1 = Map.ofEntries(Map.entry("AP", "Amaravati"),
                                                   Map.entry("KA", "Bengaluru"),
                                                   Map.entry("TN", "Chennai"));
        System.out.println(myMap1);



    }
}
