package programs;

/**
 * Created by rk0000 on 8/8/18.
 */
public class FirstRepeatedInArray {
    public static void main(String[] args) {
        int[] array = {8,4,9,5,2,5,9};
        int counter = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1;j<array.length; j++) {
                if(array[i] == array[j]) {
                    counter++;
                }
                if(counter==2) {
                    System.out.println(array[i]);
                    System.exit(0);
                }
            }
        }
    }
}
