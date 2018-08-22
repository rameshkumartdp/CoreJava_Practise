package basic;

/**
 * Created by rk0000 on 6/22/18.
 */
public interface InterfaceObject {
    void display();
}

class Excecute {
    public static void main(String[] args) {
        InterfaceObject io = new InterfaceObject() {
            @Override
            public void display(){
                print();
                System.out.println("display()--->");
            }

            public void print() {
                System.out.println("hello()--->");
            }
        };
        io.display();
    }
}
