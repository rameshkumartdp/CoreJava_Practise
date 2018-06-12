package basic;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by rk0000 on 6/12/18.
 */
public class ReflectionDemo extends Thread implements Cloneable, Serializable{
    private int id;
    public String name;
    private double salary;

    private ReflectionDemo(String hello) {

    }

    public static void main(String[] args) {
        ReflectionDemo demo = new ReflectionDemo("hi");
        Class cls = demo.getClass();
        Field[] fld = cls.getDeclaredFields();
        for(Field i:fld) {
            System.out.println(i+" - "+i.getName());
        }

        Constructor[] cnstr = cls.getDeclaredConstructors();
        for(Constructor i:cnstr) {
            System.out.println(i+" - "+i.getName());
        }

        Class[] intf = cls.getInterfaces();
        for(Class cls1:intf) {
            System.out.println(cls1+" - "+cls1.getName());
        }

        Class superCls = cls.getSuperclass();
        System.out.println(superCls+" - "+superCls.getName());

        int mod = cls.getModifiers();
        System.out.println(mod);
        if(Modifier.isPublic(mod)) {
            System.out.println("PUBLIC");
        }
    }
}
