package basic;

class Parent1 {
    public Parent1() {
        this.display();
    }
    public void display() {
        System.out.println("In parent display method");
    }
}

public class Pract17 extends Parent1 {
    public Pract17() {
        this.display();
    }
    public void display() {
        System.out.println("In child display method");
    }
    public static void main(String args[]) {
        new Pract17();
    }
}