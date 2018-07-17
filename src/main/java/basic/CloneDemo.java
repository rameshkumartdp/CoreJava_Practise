package basic;

/**
 * Created by rk0000 on 7/18/18.
 */
public class CloneDemo implements  Cloneable{
    private String name;
    private int salary;

    public CloneDemo(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo cloneDemo = new CloneDemo("Tom",10000);
        CloneDemo cloneDemo1 = (CloneDemo) cloneDemo.clone();
        System.out.println(cloneDemo1.getName());
    }
}
