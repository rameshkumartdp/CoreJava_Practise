package spring.factory;

/**
 * Created by rk0000 on 6/27/18.
 */
public class Details {
    String name, company;

    public static Details getDetailsInstance(String name) {
        return new Details();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
