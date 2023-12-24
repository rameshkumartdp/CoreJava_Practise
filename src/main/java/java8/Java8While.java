package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8While {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Butch", "Toodles", "Tom");
        List<String> result = stringList.stream().takeWhile(s -> !s.equals("Tyke")).collect(Collectors.toList());
        System.out.println(result);

        List<String> result1 = stringList.stream().dropWhile(s -> !s.equals("Tyke")).collect(Collectors.toList());
        System.out.println(result1);
    }
}
