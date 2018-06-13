package exceptions;

/**
 * Created by rk0000 on 6/13/18.
 */
public class PipedExceptions {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        try {
            System.out.println(values[0]/0);
        } catch(ArithmeticException | IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch(RuntimeException e) {
            e.printStackTrace();
        }
    }
}
