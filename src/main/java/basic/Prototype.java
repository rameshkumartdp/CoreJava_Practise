package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rk0000 on 7/18/18.
 */
class Prototype {
    private List<String> myList;

    public Prototype() {
        myList = new ArrayList<>();
    }

    public Prototype(List<String> myList) {
        this.myList = myList;
    }

    public void loadData() {
        myList.add("Tom");
        myList.add("Jerry");
        myList.add("Spike");
    }

    public List<String> getMyList() {
        return myList;
    }

    public Object clone() throws CloneNotSupportedException {
        return new Prototype(myList);
    }
}

class ProtoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.loadData();
        Prototype prototype1 = (Prototype) prototype.clone();
        Prototype prototype2 = (Prototype) prototype.clone();
        System.out.println(prototype.getMyList());
        System.out.println(prototype1.getMyList());
        List<String> newList = prototype.getMyList();
        newList.add("Toodles");
        System.out.println(newList);
    }
}


