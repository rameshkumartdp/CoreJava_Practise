package basic;

class XXX {
    void show() {
        System.out.println("XXX");
    }
}

public class Pract3 extends XXX {
    void show() {
        //super();
        System.out.println("YYY") ;
    }
    public static void main(String args[]) {
        new Pract3().show();
    }
}
