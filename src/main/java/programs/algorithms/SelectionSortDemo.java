package programs.algorithms;

/**
 * Created by Ramesh on 008 08.Jun.21.
 */
public class SelectionSortDemo {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++) {
            int index = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
                int small = arr[index];
                arr[index] =arr[i];
                arr[i] = small;
            }
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        selectionSort(arr1);//algorithms array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
