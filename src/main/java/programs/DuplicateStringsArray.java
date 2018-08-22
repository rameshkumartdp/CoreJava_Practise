package programs;

/**
 * Created by rk0000 on 8/7/18.
 */
public class DuplicateStringsArray {
    public static void main(String[] args) {
        String[] array = {"bye", "ramesh", "hi","kumar", "ramesh", "hello"};
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j] );

                }
            }
        }
    }
}
