package basic;

/**
 * Created by rk0000 on 6/12/18.
 */
public class StaticInner {
    int id;
    static String type;
    public static class SubStaticInner {
        String name;
         static void display(String name){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        StaticInner.SubStaticInner.display("Ramesh");
    }
}
