package basic;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by rk0000 on 7/15/18.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("HashMap--->  "+HashMap.class.getClassLoader());
        System.out.println("Date--->  "+Date.class.getClassLoader());
    }
}
