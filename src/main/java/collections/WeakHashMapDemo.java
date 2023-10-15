package collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        HashMap<MapVO, String> myMap = new HashMap<>();
        MapVO tom = new MapVO("Tom");
        myMap.put(tom, "Cat");
        MapVO jerry = new MapVO("Jerry");
        myMap.put(jerry, "Mouse");
        MapVO spike = new MapVO("Spike");
        myMap.put(spike, "Dog");
        System.out.println(myMap);

        tom = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(myMap);
        System.out.println("------------\n");

        WeakHashMap<MapVO, String> weakMap = new WeakHashMap<>();
        MapVO tom1 = new MapVO("Tom");
        weakMap.put(tom1, "Cat");
        MapVO jerry1 = new MapVO("Jerry");
        weakMap.put(jerry1, "Mouse");
        MapVO spike1 = new MapVO("Spike");
        weakMap.put(spike1, "Dog");
        System.out.println(weakMap);

        tom1 = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(weakMap);

    }
}

class MapVO {

    private String name;

    public MapVO(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("finalize called -->");
    }

    @Override
    public String toString() {
        return "MapVO{" +
                "name='" + name + '\'' +
                '}';
    }
}
