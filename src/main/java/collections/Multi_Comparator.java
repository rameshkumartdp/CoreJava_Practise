package collections;

import java.util.*;

/**
 * Created by rk0000 on 7/15/18.
 */
public class Multi_Comparator {
    public static void main(String[] args) {
        List<Labour> myList = Arrays.asList(new Labour("Ramesh",29,100),new Labour("Tom",10,90), new Labour("Jerry",18,99));
        Collections.sort(myList, new ComparatorChain(new NameComparator(),new AgeComparator(), new SalaryComparator()));
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

class NameComparator implements Comparator<Labour> {
    @Override
    public int compare(Labour l1, Labour l2) {
        return l1.name.compareTo(l2.name);
    }
}

class AgeComparator implements Comparator<Labour> {
    @Override
    public int compare(Labour l1, Labour l2) {
        return l1.age - l2.age ;
    }
}

class SalaryComparator implements Comparator<Labour> {
    @Override
    public int compare(Labour l1, Labour l2) {
        return l1.salary - l2.salary;
    }
}