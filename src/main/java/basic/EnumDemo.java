package basic;

import java.io.Serializable;

/**
 * Created by rk0000 on 6/22/18.
 */
public enum EnumDemo implements Serializable{
    RAMESH("Sears", 29, "Bangalore"),
    SURESH("MindTree", 29, "Chennai"),
    SHIVA("Indigo", 32, "Bangalore");

    String comapny;
    int age;
    String city;

    EnumDemo(String company, int age, String city) {
        this.comapny = company;
        this.age = age;
        this.city = city;
    }

    //public abstract void abs();

    public String getComapny() {
        return comapny;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        for(EnumDemo edemo : EnumDemo.values()) {
            System.out.println(edemo.getComapny()+" - "+ edemo.getCity()+" - "+edemo.getAge());
            System.out.println(EnumDemo.RAMESH.getComapny());
        }
    }
}
