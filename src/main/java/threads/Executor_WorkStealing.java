package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Ramesh on 031 31.May.21.
 */
public class Executor_WorkStealing {
    public static void main(String[] args) {
        try {
            ExecutorService executor = Executors.newWorkStealingPool();  //ForkJoinPool
            List<Callable<String>> callableList = Arrays.asList(
                    () -> "callable1",
                    () -> "callable2");
            executor.invokeAll(callableList).stream().map(future -> {
                try {
                    return future.get();
                } catch (Exception e) {

                }
                return "";
            }).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
