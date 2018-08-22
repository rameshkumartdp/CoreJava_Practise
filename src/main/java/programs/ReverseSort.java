package programs;

import org.hibernate.validator.constraints.EAN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rk0000 on 8/22/18.
 */
public class ReverseSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ramesh", "Kumar");
        List<String> newList = new ArrayList<>();
        for(String str:list) {
            newList.add(new StringBuffer(str).reverse().toString());
        }
        Collections.sort(newList);
        //System.out.println(newList);
        for(String str:newList) {
            System.out.println(new StringBuffer(str).reverse().toString());
        }
    }
}
