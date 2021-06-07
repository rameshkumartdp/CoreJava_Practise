package collections;

import java.util.*;

/**
 * Created by Ramesh on 006 06.Jun.21.
 */
public class ArraysAsList {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Toodles");
//        ArrayList<String> list = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Toodles");
//        myList.add("Butch");   //Not Supported as myList is created with java.util.Arrays$ArrayList
        Collections.sort(myList, Comparator.reverseOrder());
        myList.forEach((String str) -> System.out.print(str + "\t"));
        System.out.println("\n");

        List<String> myList1 = new ArrayList<>(Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Toodles"));
        myList1.add("Butch");
        Collections.sort(myList1, Comparator.reverseOrder());
        myList1.forEach((String str) -> System.out.print(str + "\t"));


        //https://stackoverflow.com/questions/16748030/difference-between-arrays-aslistarray-and-new-arraylistintegerarrays-aslist

    }
}
