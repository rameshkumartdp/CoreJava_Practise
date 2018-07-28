package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by rk0000 on 7/27/18.
 */
public class LockDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(new ReentrantLock());
        Runnable r =  () -> {
                                System.out.println(Thread.currentThread().getName()+"  "+counter.getCount());
                            };
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        Thread t3 = new Thread(r, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    Lock lock;
    int count = 98;
    public Counter(Lock lock) {
        this.lock = lock;
    }

    public int getCount() {
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
        return count;
    }
}
