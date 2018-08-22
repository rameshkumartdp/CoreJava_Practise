package programs;

/**
 * Created by rk0000 on 7/17/18.
 */
public class Tripleton {
    private static volatile Tripleton tripleton;
    private static int counter = 0;

    private Tripleton() {
        counter++;
    }

    public static Tripleton getInstance() {
        synchronized (Tripleton.class) {
            if (counter < 3) {
                tripleton = new Tripleton();
            }
        }
        return tripleton;
    }
}

class TripletonClient {
    public static void main(String[] args) {
        Tripleton tpl = Tripleton.getInstance();
        Tripleton tpl1 = Tripleton.getInstance();
        Tripleton tpl2 = Tripleton.getInstance();
        Tripleton tpl3 = Tripleton.getInstance();
        Tripleton tpl4 = Tripleton.getInstance();
        System.out.println("hashCodes --- >  "+tpl.hashCode()+" "+tpl1.hashCode()+" "+tpl2.hashCode()+" "+tpl3.hashCode()+" "+tpl4.hashCode());
    }
}
