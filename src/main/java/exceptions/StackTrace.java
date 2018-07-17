package exceptions;

/**
 * Created by rk0000 on 7/16/18.
 */
public class StackTrace {
    public static void main(String[] args) {
        Exception ex = null;
        try {
            int c = 10/0;
        } catch(Exception e) {
            ex = e;
        } finally {
            System.out.println("In finally ---> ");
            ex.printStackTrace();
        }
    }
}
