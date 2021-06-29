package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Ramesh on 012 12.Jun.21.
 */
public class CustomMap {
    public static void main(String[] args) {
        MapImpl map  = new MapImpl();
        map.put(1, "Tom");
        map.put(2, "Jerry");
        map.put(3, "Spike");
        map.put(4, "Tyke");
        map.put(2, "Toodles");
        System.out.println(map);
    }
}

class MapImpl<K, V> {
    int defaultSize = 16;
    MyEntry<K, V>[] buckets;
    public MapImpl() {
        buckets = new MyEntry[defaultSize];
    }
    public MapImpl(int size) {
        buckets = new MyEntry[size];
    }

    void checkIfKeyIsNull(K key) {
        if(key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
    }

    int getbucketIndex(K key) {
        return (key.hashCode()%buckets.length);
    }

    public V get(K key) {
        checkIfKeyIsNull(key);
        int index = getbucketIndex(key);
        MyEntry<K, V> entry = buckets[index];
        while(entry!=null && !key.equals(entry.getKey())) {
            entry = entry.getNext();
        }
        return entry!=null ? entry.getValue() : null;
    }

    public void put(K key, V value) {
        checkIfKeyIsNull(key);
        int index = getbucketIndex(key);
        MyEntry<K, V> entry = buckets[index];
        boolean done = false;
        if(entry != null) {
            while(!done) {
                if(key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if(entry.getNext() == null) {
                    entry.setNext(new MyEntry<K, V>(key, value));
                    done = true;
                }
                entry = entry.getNext();
            }
        } else {
            buckets[index] = new MyEntry<>(key, value);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.asList(buckets).stream().filter(bucket -> bucket!=null).collect(Collectors.toList()).toArray());
    }
}

class MyEntry<K, V> {
    private K key;
    private V value;
    private MyEntry<K, V> next;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyEntry<K, V> getNext() {
        return next;
    }

    public void setNext(MyEntry<K, V> next) {
        this.next = next;
    }

    public MyEntry(K key, V value) {
        this.key = key;
        this.setValue(value);
    }

    @Override
    public String toString() {
        return this.key + "=" + this.value;
    }
}