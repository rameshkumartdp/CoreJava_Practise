package java8;

import java.util.Arrays;

public class SafeVarArgsDemo {

    public static void main(String[] args) {
        SafeVarArgsDemo demo = new SafeVarArgsDemo();
        Object[] objArray = new Object[] {"1", "2", "3"};
        String[] strArray = new String[] {"4", "5", "6"};
        objArray = strArray;
        System.out.println(Arrays.asList(objArray));
//        demo.printData(objArray);
    }

    void printData(String[] docs) {
        System.out.println(Arrays.asList(docs));
    }
}
