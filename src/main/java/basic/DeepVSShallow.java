package basic;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Ramesh on 028 28.Nov.21.
 */
public class DeepVSShallow {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] values = {1,2,3};
        DeepVSShallowUSE useObj = new DeepVSShallowUSE();
        System.out.println(useObj.setData(values));
        values[2] = 5;
        System.out.println(useObj.setData(values));
        BookDemo bookDemo = new BookDemo("C", 123);
        DeepVSShallowUSE useObj1 = new DeepVSShallowUSE(132228, "Ramesh", 100000, bookDemo);
        useObj1.printData();

        DeepVSShallowUSE useObj2 = (DeepVSShallowUSE)useObj1.clone();
        useObj2.printData();

        useObj1.id = 123456;
        useObj1.name = "Kumar";
        useObj1.salary = 98765;
        bookDemo.setBookName("JAVA");
        //useObj1.getBook().setBookName("JAVA");
        useObj1.printData();
        useObj2.printData();
    }
}

class DeepVSShallowUSE implements Cloneable {
    int[] data = null;
    DeepVSShallowUSE() {}
    String setData(int[] array) {
        data = array;
        return Arrays.toString(data);
    }

    int id;
    String name;
    double salary;
    BookDemo book;
    DeepVSShallowUSE(int id, String name, double salary, BookDemo book) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.book = book;
    }

    void printData() {
        System.out.println("DATA----->  "+id+" "+name+" "+salary+" "+book);
    }

    public int[] getData() {
        return data;
    }

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

    public BookDemo getBook() {
        return book;
    }

    public void setBook(BookDemo book) {
        this.book = book;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepVSShallowUSE obj = (DeepVSShallowUSE)super.clone();
        obj.setBook((BookDemo) obj.getBook().clone());
        return obj;
    }
}

class BookDemo implements Cloneable {
    String bookName;
    double cost;

    public BookDemo(String bookName, double cost) {
        this.bookName = bookName;
        this.cost = cost;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BOOKDATA---->  " + bookName +" "+ cost;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
