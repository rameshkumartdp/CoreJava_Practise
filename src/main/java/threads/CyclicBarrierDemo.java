package threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo extends Thread {

    CyclicBarrier cyclicBarrier;

    CyclicBarrierDemo(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Before barrier for " + currentThread().getName());
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("After barrier for " + currentThread().getName());
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("Barrier crossed");
            }
        });
        Thread t1 = new Thread(new CyclicBarrierDemo(cyclicBarrier), "T1");
        Thread t2 = new Thread(new CyclicBarrierDemo(cyclicBarrier), "T2");
        Thread t3 = new Thread(new CyclicBarrierDemo(cyclicBarrier), "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
