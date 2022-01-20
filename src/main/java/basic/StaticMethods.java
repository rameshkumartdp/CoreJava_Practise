package basic;

/**
 * Created by rk0000 on 6/13/18.
 */
class StaticMethods_Super {
    public static String display() {
        System.out.println("DISPLAY in StaticMethods_Super--->");
        return "";
    }
}

public class StaticMethods extends StaticMethods_Super {
    //@Override
    public static String display() {
        System.out.println("DISPLAY in StaticMethods--->");
        return "";
    }

    public static String display(String name) {
        System.out.println(name + " DISPLAY in StaticMethods  --->");
        return "";
    }

    public static void main(String[] args) {
        StaticMethods obj = new StaticMethods();
        System.out.println(obj.display());
        System.out.println(StaticMethods.display());
        System.out.println(StaticMethods.display("Ramesh"));
    }
}


