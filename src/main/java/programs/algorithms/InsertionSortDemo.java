package programs.algorithms;

/**
 * Created by Ramesh on 007 07.Jun.21.
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        insertionSort(arr1);
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int array[]) {
        int length = array.length;
        for(int i=1; i<length; i++) {
            int key = array[i];
            int j = i-1;
            while(j>-1 && array[j] > key) {
                array[j+1]  = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
