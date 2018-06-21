package basic;

/**
 * Created by rk0000 on 6/4/18.
 */
public class Final_Demo {
    int age;
    public static void display() {
        System.out.println("in SUper-->");
    }
}

class Final_Sub extends Final_Demo {
    //@Override
    public static void display() {
        System.out.println("in Sub-->");
    }

    public static void main(String[] args) {
        Final_Sub fs = new Final_Sub();
        System.out.println(fs.age);
        fs.display();
    }
}
