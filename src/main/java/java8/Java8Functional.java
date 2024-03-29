package java8;

/**
 * Created by Ramesh on 028 28.Nov.21.
 */
@FunctionalInterface
interface TestFunctional {
    abstract boolean equals(Object var1);  //This is from Object class
    abstract int hashCode();              //This is from Object class

    void print();
    static void display() {}
    default void show() {}
}

public class Java8Functional implements TestFunctional {
    @Override
    public void print() {
        System.out.println("PRINT---->");
    }

    public static void main(String[] args) {
        new Java8Functional().print();
    }
}

@FunctionalInterface
interface TestFunctional_SUB extends TestFunctional {
    @Override
    void print();
    //void print1();
}

interface TEST1 {
    void test1();
}

interface TEST2 extends TEST1 {
    @Override
    void test1();
}
