package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
    public static void main(String[] args) {

        //stream() vs parallelStream()
        List<String> list = new ArrayList<>();
        for(int i=1; i<1000; i++) {
            list.add(String.valueOf(i));
        }
        {
            long startTime = System.currentTimeMillis();
            System.out.println(list.stream().map(Integer::valueOf).filter(val -> (val % 2 == 0)).collect(Collectors.toList()));
            long endTime = System.currentTimeMillis();
            System.out.println("STREAM TIME--->  " + (endTime-startTime));
        }
        {
            long startTime1 = System.currentTimeMillis();
            System.out.println(list.parallelStream().map(Integer::valueOf).filter(val -> (val % 2 == 0)).collect(Collectors.toList()));
            long endTime1 = System.currentTimeMillis();
            System.out.println("PARALLEL STREAM TIME--->  " + (endTime1-startTime1));
        }

        //map() vs flatMap()
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list1.stream().map(String::valueOf).collect(Collectors.toList()));

        List<Integer> one = Arrays.asList(1,2);
        List<Integer> two = Arrays.asList(3,4,5);
        List<Integer> three = Arrays.asList(6,7,8);
        List<List<Integer>> list2 = Arrays.asList(one, two, three);
        System.out.println("With Stream--->   " + list2.stream().map(String::valueOf).collect(Collectors.toList()));

        System.out.println("With Parallel Stream--->   " + list2.stream().flatMap(val -> val.stream()).collect(Collectors.toList()));
    }
}
