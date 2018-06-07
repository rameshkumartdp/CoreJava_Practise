package basic;

/**
 * Created by rk0000 on 6/4/18.
 */
public class This_Demo {

    int salary;

    public void display() {
        salary = 1234;
    }

    public static void main(String args[]) {
        This_Demo o1 = new This_Demo();
        o1.display();
        System.out.println(o1.salary);
        System.out.println('\u0000');
    }

}
