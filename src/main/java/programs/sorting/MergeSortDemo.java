package programs.sorting;

/**
 * Created by Ramesh on 008 08.Jun.21.
 */
public class MergeSortDemo {

    static void merge(int[] arr, int begin, int mid, int end) {
        int left = mid-begin;
        int right = end-mid;
        int[] leftArray = new int[left];
        int[] rightArray = new int[right];
        for(int i=0; i<left; i++) {
            leftArray[i] = arr[begin+i];
        }
        for(int j=0; j<right; j++) {
            rightArray[j] = arr[mid+j];
        }

        int i=0;
        int j=0;
        int k= begin;

        while(i<left && j<right) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<left) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<right) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    static void mergesort(int[] arr, int begin, int end) {
        if(begin < end) {
            int mid = (begin+end) / 2;
            mergesort(arr, begin, mid-1);
            mergesort(arr, mid+1, end);
            merge(arr, begin, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 23, 101, 45, 65, 67, 89};
        int length = arr.length;
        mergesort(arr, 0, length-1);

        for (int i=0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
