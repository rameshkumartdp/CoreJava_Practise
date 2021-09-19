package threads;

/**
 * Created by Ramesh on 019 19.Sep.21.
 */
public class Threads_OnebyOne {

    private static class MyTask implements Runnable {
        private Thread predecessor;

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Started");
            if (predecessor != null) {
                try {
                    predecessor.join();
                    System.out.println("JOIN for --> " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " Finished");
        }

        public void setPredecessor(Thread t) {
            this.predecessor = t;
        }
    }

    public static void main(String[] args) {
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        MyTask task3 = new MyTask();
        final Thread t1 = new Thread(task1, "Thread - 1");
        final Thread t2 = new Thread(task2, "Thread - 2");
        final Thread t3 = new Thread(task3, "Thread - 3");
        task2.setPredecessor(t1);
        task3.setPredecessor(t2);

        t1.start();
        t2.start();
        t3.start();
    }
}