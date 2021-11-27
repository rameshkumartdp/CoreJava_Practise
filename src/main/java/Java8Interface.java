/**
 * Created by Ramesh on 025 25.Sep.21.
 */
interface FirstInterface {
    default void printData() {
        System.out.println("Data from FirstInterface");
    }
}

interface SecondInterface {
    default void printData() {
        System.out.println("Data from SecondInterface");
    }
}

public class Java8Interface implements FirstInterface, SecondInterface {

    @Override
    public void printData() {
        System.out.println("Data from Class");
    }

    public static void main(String[] args) {
        Java8Interface obj = new Java8Interface();
        obj.printData();
    }

}
