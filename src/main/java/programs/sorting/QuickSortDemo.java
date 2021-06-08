package programs.sorting;

/**
 * Created by rk0000 on 8/3/18.
 */
public class QuickSortDemo {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,1, 10, 6, 5, 3};
        int length = arr.length;
        quicksort(arr, 0, length-1);
        for (int i=0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
