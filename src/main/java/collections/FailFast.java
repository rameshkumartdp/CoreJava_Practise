package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hi", "bye");
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            itr.remove();

        }

    }
}
