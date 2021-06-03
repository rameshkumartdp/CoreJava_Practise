package collections;

import java.util.*;

/**
 * Created by rk0000 on 7/15/18.
 */
public class Multi_Comparator {
    public static void main(String[] args) {
        Comparator<Labour> nameComparator = new Comparator<Labour>() {
            @Override
            public int compare(Labour o1, Labour o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Comparator<Labour> ageComparator = new Comparator<Labour>() {
            @Override
            public int compare(Labour o1, Labour o2) {
                return o1.age - o2.age;
            }
        };
        Comparator<Labour> salaryComparator = new Comparator<Labour>() {
            @Override
            public int compare(Labour o1, Labour o2) {
                return o1.salary - o2.salary;
            }
        };

        Labour ramesh = new Labour("Ramesh",29,100);
        Labour tom = new Labour("Tom",10,90);
        Labour jerry = new Labour("Jerry",18,99);
        List<Labour> myList = Arrays.asList(ramesh, tom, jerry);
        Collections.sort(myList, new ComparatorChain(nameComparator, ageComparator, salaryComparator));
        myList.forEach((Labour obj) -> System.out.println(obj.name+" "+obj.age+" "+obj.salary));
    }
}

class Labour {
    String name;
    int age;
    int salary;

    Labour(String name, int age, int salary) {
        this.name = name;
        this.age= age;
        this.salary = salary;
    }
}

class ComparatorChain implements Comparator<Labour>{
    private List<Comparator<Labour>> comparatorList;
    ComparatorChain(Comparator<Labour>... comparatorsList) {
        comparatorList = Arrays.asList(comparatorsList);
    }
    @Override
    public int compare(Labour l1, Labour l2) {
        for(Comparator<Labour> comparator : comparatorList) {
            int value = comparator.compare(l1, l2);
            if(value != 0) {
                return value;
            }
        }
        return 0;
    }
}