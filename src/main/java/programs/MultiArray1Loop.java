package programs;

/**
 * Created by Ramesh on 011 11.Jun.21.
 */
public class MultiArray1Loop {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i=0; i< rows*columns; i++) {
            int row = i / columns;
            int col = i % columns;
            System.out.print(arr[row][col] + " ");
        }
    }
}
