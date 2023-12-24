package basic;

/**
 * Created by rk0000 on 7/18/18.
 */
public class CloneDemo implements  Cloneable{
    private String name;
    private int salary;
    private Work work;

    public CloneDemo(String name, int salary, Work work) {
        this.name = name;
        this.salary = salary;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo cloneDemo = new CloneDemo("Tom",10000, new Work("Developer", "US"));
        CloneDemo cloneDemo1 = (CloneDemo) cloneDemo.clone();
        System.out.println("cloneDemo --->  " + cloneDemo);
        System.out.println("cloneDemo1 --->  " + cloneDemo1);

        cloneDemo1.setName("Jerry");     // Primitive change
        System.out.println("cloneDemo .Jerry --->  " + cloneDemo);
        System.out.println("cloneDemo1 .Jerry --->  " + cloneDemo1);

        Work work1 = cloneDemo1.getWork();
        work1.setDepartment("Sales");
        work1.setLocation("India");
        cloneDemo1.setWork(work1);     // Object change
        System.out.println("cloneDemo .Work --->  " + cloneDemo);
        System.out.println("cloneDemo1 .Work --->  " + cloneDemo1);

    }

    @Override
    public String toString() {
        return "CloneDemo{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", work=" + work +
                '}';
    }
}

class Work {
    private String department;
    private String location;

    public Work(String department, String location) {
        this.department = department;
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public String getLocation() {
        return location;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Work{" +
                "department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
