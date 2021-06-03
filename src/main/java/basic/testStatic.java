package basic;

class test123 {
    static int a;

    public static void display() {
        System.out.println(a);
    }

    public test123() {
        a = 10;
    }

    static {
        System.out.println("in static");
        a = 10;
    }
}

class testStatic {
    public static void main(String args[]) {
        System.out.println("in main");
        test123.display();
    }
}
