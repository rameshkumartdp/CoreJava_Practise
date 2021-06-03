package collections;

import java.util.Optional;

/**
 * Created by rk0000 on 7/12/18.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        String str = "hello";
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.isPresent());
        System.out.println(opt);
        System.out.println(opt.orElse("Hello"));

        System.out.println(opt.filter(val -> val.equals("hello")).get());


    }
}
