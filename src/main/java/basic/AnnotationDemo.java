package basic;

/**
 * Created by rk0000 on 6/13/18.
 */
class SuperDemo {
    void display() {
        System.out.println("Parent");
    }
}

public class AnnotationDemo extends SuperDemo {
    @Override
    void display() {
        System.out.println("Child");
    }

    @Deprecated
    void show() {
        System.out.println("SHOW");
    }

    public static void main(String[] args) {
        AnnotationDemo dem = new AnnotationDemo();
        dem.display();
        dem.show();
    }
}
