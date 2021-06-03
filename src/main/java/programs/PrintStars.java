package programs;

/**
 * Created by rk0000 on 8/8/18.
 */
public class PrintStars {
    static void halfPyramid() {
        int n = 5;
        for(int i=1; i<n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reversePyramid() {
        int n = 4;
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void fullPyramid() {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullPyramid();
    }
}
