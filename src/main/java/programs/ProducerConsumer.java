package programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rk0000 on 7/19/18.
 */
public class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        HotelItems hotel = new HotelItems();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    hotel.produce();
                } catch (Exception e) {
                    e.printStackTrace();;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    hotel.consume();
                } catch (Exception e) {
                    e.printStackTrace();;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class HotelItems {
    private LinkedList<Integer> items = new LinkedList<>();
    int initialSet = 2;

    public void produce() throws Exception {
        for(int i=0; i<10; i++) {
            synchronized (this) {
                if(items.size() == initialSet) {
                    wait();
                }
                System.out.println("Producing ---> "+i);
                items.add(i);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws Exception {
        for(int i=0; i<10; i++) {
            synchronized (this) {
                if(items.size() == 0) {
                    wait();
                }
                int val = items.removeFirst();
                System.out.println("Consuming ---> "+val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
