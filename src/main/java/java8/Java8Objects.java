package java8;

import java.util.Objects;

public class Java8Objects {
    public static void main(String[] args) {
        EmployeeObj obj = new EmployeeObj();
        System.out.println(Objects.toString(obj, ""));
    }
}

class EmployeeObj {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
