package threads;

import java.util.concurrent.CountDownLatch;

/**
 * Created by rk0000 on 7/27/18.
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"  started");
                latch.countDown();
            }
        };
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        Thread t3 = new Thread(r, "T3");
        t1.start();
        t2.start();
        t3.start();

        try {
            latch.await();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MAIN started");
    }
}

class Count implements Runnable {
    @Override
    public void run()  {
        System.out.println(Thread.currentThread().getName()+"  started");
    }
}
