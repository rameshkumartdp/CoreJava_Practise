package threads;

import java.util.concurrent.*;

/**
 * Created by Ramesh on 030 30.May.21.
 */
public class Executor_Demo {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
            Future future = executor.submit(new Callable() {
                @Override
                public Object call() {
                    System.out.println("Running thread-->  ");
                    return "success";
                }
            });
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("FUTURE status------>  " + future.isDone() + "  " +future.get(1, TimeUnit.SECONDS));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
