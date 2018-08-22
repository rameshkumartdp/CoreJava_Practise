package programs;

/**
 * Created by rk0000 on 8/7/18.
 */
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = {12, 6, 78, 34, 21, 99, 10};
        int large = array[0];
        int secondLarge = array[0];
        int small = array[0];
        int secondSmall = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                secondLarge = large;
                large = array[i];
            } else if (array[i] > secondLarge) {
                secondLarge = array[i];
            }
            else if (array[i] < small) {
                secondSmall = small;
                small = array[i];
            } else if (array[i] < secondSmall) {
                secondSmall = array[i];
            }
        }
        System.out.println(large + "  " + secondLarge+"  "+small+"  "+secondSmall);
    }
}
