package hibernate.Component;

import java.io.Serializable;

/**
 * Created by rk0000 on 6/26/18.
 */
public class SalaryDetails implements Serializable{

    String company;
    double salary;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
