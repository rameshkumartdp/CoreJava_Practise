package collections;

import java.util.Optional;

/**
 * Created by rk0000 on 7/12/18.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("123");
        System.out.println(opt.isPresent());
        System.out.println(opt.orElse("Hello"));


    }
}
