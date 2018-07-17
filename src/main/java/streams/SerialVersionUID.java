package streams;

import basic.Test;

import java.io.*;

/**
 * Created by rk0000 on 7/17/18.
 */
public class SerialVersionUID  {
    public static void main(String[] args) throws Exception {
        /*TestObject to = new TestObject("Ramesh", 29);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/serial.txt"));
        oos.writeObject(to);*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/serial.txt"));
        TestObject ts = (TestObject) ois.readObject();
        System.out.println(ts.getName());
    }
}

class TestObject implements Serializable {
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;

    TestObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

