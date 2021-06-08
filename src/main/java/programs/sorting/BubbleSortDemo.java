package programs.sorting;

/**
 * Created by rk0000 on 7/20/18.
 */
public class BubbleSortDemo {

    static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp= arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 9};
        bubbleSort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
