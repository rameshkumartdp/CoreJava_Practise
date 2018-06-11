package threads;

/**
 * Created by rk0000 on 6/11/18.
 */
public class LightWeight extends Thread{

    public void run(){
        String threadName = Thread.currentThread().getName();
        try {
            if (threadName.equals("first")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(threadName + "---> " + i);
                    Thread.sleep(10);
                }
            } else {
                for (int i = 10; i >= 0; i--) {
                    System.out.println(threadName + "---> " + i);
                    Thread.sleep(10);
                }
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LightWeight lw1 = new LightWeight();
        LightWeight lw2 = new LightWeight();
        lw1.setName("first");
        lw2.setName("second");
        lw1.start();
        lw2.start();
        try {
            lw1.join();
            lw2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
