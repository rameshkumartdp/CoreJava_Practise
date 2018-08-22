package programs;

/**
 * Created by rk0000 on 8/8/18.
 */
public class PrintStars {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=5; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
