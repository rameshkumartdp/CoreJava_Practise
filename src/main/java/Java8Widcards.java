import java.util.ArrayList;
import java.util.List;

public class Java8Widcards {
    public static void main(String[] args) {
        List<?> myList = new ArrayList<>();
        //myList.add(10);
        print(myList);
    }

    static void print(List<?> input) {
        input.stream().forEach(System.out::println);
    }
}
