package programs;

/**
 * Created by rk0000 on 7/20/18.
 */
public class DeadLock {
    String str1 = "Tom";
    String str2 = "Jerry";

    Thread t1 = new Thread(
                            () -> {
                                    while(true) {
                                        synchronized (str1) {
                                            synchronized (str2) {
                                                System.out.println("By Thread1 --> ");
                                            }
                                        }
                                    }
                           });

    Thread t2 = new Thread(
                            () -> {
                                    while(true) {
                                        synchronized (str2) {
                                            synchronized (str1) {
                                                System.out.println("By Thread2 --> ");
                                            }
                                        }
                                    }
                            });

    public static void main(String[] args) throws Exception{
        DeadLock deadLock = new DeadLock();
        deadLock.t1.start();
        deadLock.t2.start();
        deadLock.t1.join();
        deadLock.t2.join();
    }
}
