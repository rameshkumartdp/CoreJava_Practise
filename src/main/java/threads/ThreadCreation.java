package threads;

/**
 * Created by rk0000 on 7/25/18.
 */
public class ThreadCreation extends Thread implements Runnable {

    public static void main(String[] args) {
        System.out.println("Thread Creation --->");
        ThreadCreation tc = new ThreadCreation();
        tc.start();
    }

}
