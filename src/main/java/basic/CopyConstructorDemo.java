package basic;

public class CopyConstructorDemo {
    private String name;
    private int salary;
    private Work1 work1;

    public CopyConstructorDemo(String name, int salary, Work1 work1) {
        this.name = name;
        this.salary = salary;
        this.work1 = work1;
    }

    public CopyConstructorDemo(CopyConstructorDemo copyConstructorDemo) {
        this.name = copyConstructorDemo.name;
        this.salary = copyConstructorDemo.salary;
        this.work1 = copyConstructorDemo.work1;
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

    public Work1 getWork1() {
        return new Work1(this.work1);
    }

    public void setWork1(Work1 work1) {
        this.work1 = work1;
    }

    public static void main(String[] args) {
        CopyConstructorDemo cDemo = new CopyConstructorDemo("Tom",10000, new Work1("Developer", "US"));
        CopyConstructorDemo cDemo1 = new CopyConstructorDemo(cDemo);
        System.out.println("cDemo --->  " + cDemo);
        System.out.println("cDemo1 --->  " + cDemo1);

        cDemo1.setName("Jerry");     // Primitive change
        System.out.println("cDemo --->  " + cDemo);
        System.out.println("cDemo1 --->  " + cDemo1);

        Work1 work1 = cDemo1.getWork1();
        work1.setDepartment("Sales");
        work1.setLocation("India");
        cDemo1.setWork1(work1);     // Object change
        System.out.println("cDemo --->  " + cDemo);
        System.out.println("cDemo1 --->  " + cDemo1);

    }

    @Override
    public String toString() {
        return "CloneDemo{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", work=" + work1 +
                '}';
    }
}


class Work1 {
    private String department;
    private String location;

    public Work1(String department, String location) {
        this.department = department;
        this.location = location;
    }

    public Work1(Work1 work1) {
        this.department = work1.department;
        this.location = work1.location;
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
        return "Work1{" +
                "department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
