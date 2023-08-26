/**
 * Created by Ramesh on 025 25.Sep.21.
 */
interface FirstInterface {
    default void printData() {
        System.out.println("printData from FirstInterface");
    }

//    String getData();   //Uncommenting this results in Compilation error.
}

interface SecondInterface {
    default void printData() {
        System.out.println("printData from SecondInterface");
    }

    default String getData() {
        System.out.println("getData from SecondInterface");
        return "SecondInterface::getData";
    }
}

public class Java8Interface implements FirstInterface, SecondInterface {

    @Override
    public void printData() {      //Commenting this method results compilation error
        FirstInterface.super.printData();
        SecondInterface.super.printData();
        System.out.println("Data from Class");
    }

    public static void main(String[] args) {
        Java8Interface obj = new Java8Interface();
        obj.printData();
    }

}
