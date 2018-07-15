package collections;

import java.util.*;

/**
 * Created by rk0000 on 7/15/18.
 */
public class ListDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set mySet = new HashSet<>();
        myList.add(1);
        myList.add(2);
        myList.add(8);
        myList.add(5);
        myList.add(8);
        myList.add(1);
        for(int i:myList) {
            if(!mySet.add(i)) {
                System.out.println(i);
            }
        }
    }
}
