package programs;

/**
 * Created by rk0000 on 8/13/18.
 */
public class CustomHashmap {
}

class Entry<K, V> {
    private Entry<K, V> next;
    private final K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    public Entry<K, V> getNext() {
        return next;
    }
}

class MyHashMap<K, V> {

    private int DEFAULT_BUCKET_COUNT = 10;
    private Entry<K, V>[] buckets;

    public MyHashMap() {
        buckets = new Entry[DEFAULT_BUCKET_COUNT];
    }
    public MyHashMap(int capacity) {
        buckets = new Entry[capacity];
    }
    public V get(K key) {
        throwIfKeyNull(key);
        Entry<K, V> entry = buckets[bucketIndexForKey(key)];
        while (entry != null && !key.equals(entry.getKey())) {
            entry = entry.getNext();
        }
        return entry != null ? entry.getValue() : null;
    }

    public void put(K key, V value) {
        throwIfKeyNull(key);

        int bucketIndex = bucketIndexForKey(key);
        Entry<K, V> entry = buckets[bucketIndex];

        if (null != entry) {
            boolean done = false;
            while (!done) {
                if (key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if (entry.getNext() == null) {
                    entry.setNext(new Entry<K, V>(key, value));
                    done = true;
                }
                entry = entry.getNext();
            }
        } else {
            buckets[bucketIndex] = new Entry<K, V>(key, value);
        }
    }

    public int bucketIndexForKey(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        return bucketIndex;
    }

    private void throwIfKeyNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key may not be null");
        }
    }
}

class MapClient {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(10);
        map.put(1,20);
        map.put(2,20);
        map.put(3,"hello");
        map.put(1,30);
        System.out.println(map.get(1));
    }
}
