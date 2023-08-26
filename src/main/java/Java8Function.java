import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java8Function {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Butch", "Toodles");

        Function<String, String> f1 = x -> {
                                                return x.length()>3 ? x : "";
                                            };
        Function<String, String> f2 = x -> {
                                                return x.toUpperCase();
                                            };

        Function<String, String> res = f1.compose(f2);
        stringList.forEach(x -> System.out.println(res.apply(x)));

        Function<String, String> res1 = f1.andThen(f2);
        stringList.forEach(x -> System.out.println(res1.apply(x)));

    }
}
