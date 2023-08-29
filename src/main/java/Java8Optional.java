import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by rk0000 on 7/12/18.
 */
public class Java8Optional {
    public static void main(String[] args) {
        String str = "hello";
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.isPresent());
        System.out.println(opt);
        System.out.println(opt.orElse("Hello"));

        System.out.println(opt.filter(val -> val.equals("hello")).get());
        System.out.println("--------------------------");

        AtomicInteger integer = new AtomicInteger();
        Optional<AtomicInteger> optional = Optional.ofNullable(integer);
        System.out.println(optional);

        integer.incrementAndGet();
        System.out.println(optional);

        optional.get().incrementAndGet();

        optional = Optional.of(integer);
        System.out.println(optional);

        OptionalDouble optionalDouble = OptionalDouble.of(123);
        System.out.println(optionalDouble);

        OptionalLong optionalLong = OptionalLong.of(1234567);
        System.out.println(optionalLong);

        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", null, "Toodles", null);

        List<String> outputList = stringList.stream().map(st -> getName(st))
                           .filter(Optional::isPresent)
                            .map(Optional::get)
                           .collect(Collectors.toList());
        System.out.println(outputList);


    }

    static Optional<String> getName(String input) {
        if(input == null) {
            return Optional.empty();
        }
        return Optional.of(input);
    }
}
