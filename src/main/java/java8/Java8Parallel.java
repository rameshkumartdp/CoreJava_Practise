package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Parallel {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 9, 1, 7, 3, 8, 4);
        List<Integer> sortedList = numbers.stream()
                .parallel()
                .peek(x -> System.out.println("number " + x + " Thread " + Thread.currentThread().getName()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Processors --->  " + Runtime.getRuntime().availableProcessors());


        List<Integer> sortedList1 = numbers.parallelStream()
                .peek(x -> System.out.println("number " + x + " Thread " + Thread.currentThread().getName()))
                .sorted()
                .collect(Collectors.toList());
    }
}
