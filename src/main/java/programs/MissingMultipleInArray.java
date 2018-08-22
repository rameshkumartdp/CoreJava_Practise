package programs;

/**
 * Created by rk0000 on 8/7/18.
 */
public class MissingMultipleInArray {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,4,6,9,12};
        int length = number.length;
        int count = (length+1)*(length+2)/2;
        int countAllMissings = 0;

        for(int i=1; i<count; i++){
            if(number[i-1-countAllMissings] != i){
                System.out.println("missing number " + i);
                countAllMissings++;
            }
        }
    }
}
