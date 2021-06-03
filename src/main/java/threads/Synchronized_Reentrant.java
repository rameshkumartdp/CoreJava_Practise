package threads;

/**
 * Created by Ramesh on 030 30.May.21.
 */
public class Synchronized_Reentrant extends Thread {

    void first() {
        System.out.println("IN First---->");
        synchronized (Synchronized_Reentrant.class) {
            second();
        }
    }

    void second() {
        System.out.println("IN Second---->");
    }

    @Override
    public void run() {
        System.out.println("Running Thread");
        synchronized (Synchronized_Reentrant.class) {
            first();
        }
    }

    public static void main(String[] args) {
        System.out.println("In Main------>");
        Synchronized_Reentrant demo = new Synchronized_Reentrant();
        Synchronized_Reentrant demo1 = new Synchronized_Reentrant();
        demo.start();
        demo1.start();
    }
}
