package basic;

/**
 * Created by rk0000 on 6/4/18.
 */
public abstract class Abstract_Main {

    Abstract_Main() {
        display();
    }
    void display() {
        System.out.println("Hello");
    }

    /*public static void main(String[] args) {
        System.out.println("In Main");
    }*/
}

class Abtstract_Sub extends Abstract_Main{
    public static void main(String[] args) {
        Abtstract_Sub abs = new Abtstract_Sub();
        //abs.display();
    }
}
