package basic;

public class RunTime_Demo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.availableProcessors());

    }
}
