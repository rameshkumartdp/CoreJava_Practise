package programs;

import java.util.Map;

/**
 * Created by rk0000 on 8/17/18.
 */
public class MyMap<K, V> {
    EntryClass<K, V>[] buckets;
    int DEFAULT_SIZE = 16;
    MyMap() {
        buckets = new EntryClass[DEFAULT_SIZE];
    }
    MyMap(int size) {
        buckets = new EntryClass[size];
    }

    public void checkIfKeyIsNull(K key) {
        if(key == null) {
            throw new IllegalArgumentException("Key shouldn't be NULL");
        }
    }

    public int getBucketIndex(K key) {
        return (key.hashCode() % buckets.length);
    }

    public V get(K key) {
        checkIfKeyIsNull(key);
        EntryClass<K, V> entry = buckets[getBucketIndex(key)];
        while(entry != null && !key.equals(entry.getKey())) {
            entry = entry.getNext();
        }
        return entry!=null ? entry.getValue() : null;
    }

    public void put(K key, V value) {
        checkIfKeyIsNull(key);
        int index = getBucketIndex(key);
        EntryClass<K, V> entry = buckets[index];
        boolean done = false;
        if(entry != null) {
            while(!done) {
                if(key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if(entry.getNext() == null) {
                    entry.setNext(new EntryClass<>(key, value));
                    done = true;
                }
                entry = entry.getNext();
            }
        } else {
            buckets[index] = new EntryClass<>(key, value);
        }
    }

}

class EntryClass<K, V> {
    private final K key;
    private V value;
    private EntryClass<K, V> next;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public EntryClass<K, V> getNext() {
        return next;
    }

    public void setNext(EntryClass<K, V> next) {
        this.next = next;
    }

    public EntryClass(K key, V value) {
        this.key = key;
        this.setValue(value);
    }
}

class MyMapClient {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put(1,"Tom");
        map.put(2,"Jerry");
        map.put(1,"Spike");
        System.out.println(map.get(1));

    }
}
