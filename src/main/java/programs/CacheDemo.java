package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Created by rk0000 on 8/2/18.
 */
public class CacheDemo {

    private long timeToLive;
    private HashMap<Object, Object> cacheMap;

    protected class CacheDemoInner {
        public long lastAccessed = System.currentTimeMillis();
        public String value;

        protected CacheDemoInner(String value) {
            this.value = value;
        }
    }

    public CacheDemo(long timeToLive, final long timeInterval, int max) {
        this.timeToLive = timeToLive * 2000;

        cacheMap = new HashMap<>(max);

        if (timeToLive > 0 && timeInterval > 0) {
            Thread t = new Thread( () ->  {
                                            while (true) {
                                                try {
                                                    Thread.sleep(timeInterval * 1000);
                                                } catch (InterruptedException ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
            });

            t.setDaemon(true);
            t.start();
        }
    }

    public void put(Object key, Object value) {
        synchronized (cacheMap) {
            cacheMap.put(key, value);
        }
    }

    public Object get(Object key) {
        synchronized (cacheMap) {
            CacheDemoInner c = (CacheDemoInner) cacheMap.get(key);

            if (c == null)
                return null;
            else {
                c.lastAccessed = System.currentTimeMillis();
                return c.value;
            }
        }
    }

    public void remove(String key) {
        synchronized (cacheMap) {
            cacheMap.remove(key);
        }
    }

    public int size() {
        synchronized (cacheMap) {
            return cacheMap.size();
        }
    }

    public void cleanup() {

        long now = System.currentTimeMillis();
        ArrayList<String> deleteKey = null;

        synchronized (cacheMap) {
            Iterator<?> itr = cacheMap.entrySet().iterator();

            deleteKey = new ArrayList<>((cacheMap.size() / 2) + 1);
            CacheDemoInner c = null;

            while (itr.hasNext()) {
                String key = (String) itr.next();
                c = (CacheDemoInner) ((Entry<?, ?>) itr).getValue();
                if (c != null && (now > (timeToLive + c.lastAccessed))) {
                    deleteKey.add(key);
                }
            }
        }

        for (String key : deleteKey) {
            synchronized (cacheMap) {
                cacheMap.remove(key);
            }
            Thread.yield();
        }
    }
}
