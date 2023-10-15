import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Random {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> list = intStream.boxed().collect(Collectors.toList());
        System.out.println(list);


        Random r = new Random();
        List<Integer> randomList = r.ints(8, 1,5).boxed().collect(Collectors.toList());
        System.out.println(randomList);

        Set<Integer> intSet = IntStream.of(9, 8, 7, 6, 5, 4, 3, 2).boxed().collect(Collectors.toSet());
        System.out.println(intSet);

        List<Double> randomDoubles = r.doubles(5, 1, 4).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(randomDoubles);

        SecureRandom secureRandom = new SecureRandom();
        List<Integer> secureRandomList = secureRandom.ints(8, 1,5).boxed().collect(Collectors.toList());
        System.out.println(secureRandomList);
    }
}
