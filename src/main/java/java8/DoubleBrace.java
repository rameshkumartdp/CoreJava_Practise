package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleBrace {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(){{
            add("Timon");
            add("Pumba");
        }};
        System.out.println(myList);

        List<String> myList1 = new ArrayList(Arrays.asList("Timon1", "Pumba1"));
        System.out.println(myList1);

        List<String> myList2 = Stream.of("Timon2", "Pumba2").collect(Collectors.toList());
        System.out.println(myList2);

    }
}
