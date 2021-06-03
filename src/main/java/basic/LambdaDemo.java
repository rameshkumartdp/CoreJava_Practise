package basic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rk0000 on 6/13/18.
 */
public class LambdaDemo {
    static CreateInstance instance;
    public static void main(String[] args) {
        String[] myStr = {"mango", "banana", "orange", "apple"};
        List<String> list = Arrays.asList(myStr);
        list.forEach((String str) -> System.out.println(str));
        System.out.println("-------");
        list.forEach(System.out :: println);

    }
}
