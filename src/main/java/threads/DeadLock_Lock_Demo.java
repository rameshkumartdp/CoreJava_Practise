package threads;

/**
 * Created by Ramesh on 019 19.Sep.21.
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock_Lock_Demo implements Runnable {
    private ReentrantLock lock1 = new ReentrantLock();
    private ReentrantLock lock2 = new ReentrantLock();
    private Condition condition = lock1.newCondition();

    public static void main(String[] args) throws InterruptedException {
        DeadLock_Lock_Demo runnable = new DeadLock_Lock_Demo();
        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable, "thread2");
        thread1.start();
        Thread.sleep(500);
        thread2.start();
    }

    @Override
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            lock1.lock();
            try {
                System.out.println(threadName + " has lock1");
                lock2.lock();
                try {
                    System.out.println(threadName + " has lock2");
                    lock1.lock();
                    try {
                        System.out.println(threadName + " reenters lock1");
                        condition.await(1, TimeUnit.SECONDS);
                    } finally {
                        lock1.unlock();
                    }
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
