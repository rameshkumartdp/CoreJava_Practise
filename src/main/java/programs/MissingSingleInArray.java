package programs;

/**
 * Created by rk0000 on 8/7/18.
 */
public class MissingSingleInArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,5,6,7};
        int length = array.length;
        int total = (length+1)*(length+2)/2;
        System.out.println("TOTAl---> "+total);
        for(int i=0; i<length; i++) {
            total = total-array[i];
        }
        System.out.println(total);
    }

}
