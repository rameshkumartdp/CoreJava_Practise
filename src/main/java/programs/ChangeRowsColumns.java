package programs;

/**
 * Created by rk0000 on 7/3/18.
 */
public class ChangeRowsColumns {
    static int[][] input = {  {1,2,3},
                              {4,5,6},
                              {7,8,9}  };

    public static void main(String[] args) {
        for(int i=0; i<input.length; i++) {
            for(int j=0; j<input.length; j++) {
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<input.length; i++) {
            for(int j=0; j<input.length; j++) {
//                if(input[i]==input[j]) {
//                    input[j][i] = 0;
//                }
                System.out.print(input[j][i] + " ");
            }
            System.out.println();
        }
    }
}
