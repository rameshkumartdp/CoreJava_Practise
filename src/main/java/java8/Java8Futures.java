package java8;

import java.util.concurrent.*;

public class Java8Futures {
    public static void main(String[] args) {
        ExecutorService  executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new Callable<String>() {
            public String call() {
                System.out.println("In call --> ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "call response !!!";
            }
        });

        if(!future.isCancelled()) {
            try {
                System.out.println("Result ---> " + future.get());
                future.cancel(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }



    }
}
