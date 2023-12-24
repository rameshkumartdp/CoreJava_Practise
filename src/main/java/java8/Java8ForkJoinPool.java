package java8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Java8ForkJoinPool {
    public static void main(String[] args) {
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "20");
        System.out.println(ForkJoinPool.getCommonPoolParallelism());

        ForkJoinPool pool = new ForkJoinPool(15);
        ForkJoinTask<Long> task = pool.submit(() -> LongStream.rangeClosed(1, 3_000_000)
                                                              .parallel()
                                                              .sum());
        try {
            Long total = task.get();
            System.out.println("total:  " + total);
        } catch(InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
        int poolSize = pool.getPoolSize();
        System.out.println("Pool size: " + poolSize);
    }
}
