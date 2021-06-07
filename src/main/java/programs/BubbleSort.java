package programs;

/**
 * Created by rk0000 on 7/20/18.
 */
public class BubbleSort {

    void bubbleSort(int arr[]) {
        int length = arr.length;
        for(int i=0; i<length-1; i++) {
            for(int j=0; j<length-i-1; j++) {
                if(arr[j+1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 9};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
