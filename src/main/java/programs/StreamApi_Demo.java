package programs;

import java.util.stream.IntStream;

public class StreamApi_Demo {

    public static void main(String[] args) {
        System.out.println(isPrime(20));

        //get functional interface object using Lambda
        Runnable run  = () -> System.out.println("Runnable Functional");
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
    }
}
