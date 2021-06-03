package basic;

class Parent2 {
    public Parent2() {
        this.display();
    }
    public void display() {
        System.out.println("in the parent display method");
    }
}

public class Pract18 extends Parent2 {
    public Pract18() {
        super();
        this.display();
    }
    public void display() {
        System.out.println("in the child class display method");
    }
    public static void main(String[] ar) {
        new Pract18();
    }
}