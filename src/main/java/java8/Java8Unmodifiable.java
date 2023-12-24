package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Unmodifiable {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Butch", "Toodles", "Tom");

        List<String> unmodifiableList = Collections.unmodifiableList(stringList);
        unmodifiableList.add("Test");;

        List<String> unmodifiableList1 = stringList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        unmodifiableList1.add("Test");

    }
}
