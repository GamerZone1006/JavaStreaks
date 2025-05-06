import java.util.Arrays;

public class day10 {

    // public static void bubbleSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // public static int maxIn(int[] arr, int last){
    //     int max = 0;
    //     for(int i=0;i<=last;i++){
    //         if (arr[i]>arr[last]) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }

    // public static void selectionSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int last = arr.length - i -1;
    //         int max = maxIn(arr, last);
    //         swap(arr, max, last);
    //     }
    // }

    // public static void insertionSort(int[] arr){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j>0;j--){
    //             if (arr[j]<arr[j-1]) {
    //                 swap(arr, j, j-1);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    // }

    // public static void cyclicSort(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int index = arr[i] - 1;
    //         if (arr[i] != arr[index]) {
    //             swap(arr, i, index);
    //         }
    //         else{i++;}
    //     }
    // }

    public static int missingNo(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correctInd = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            }
            else{i++;}
        }
        for(int j=0;j<arr.length;j++){
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        // int[] arr = {3,1,2,5,4};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // cyclicSort(arr);
        // System.out.println(Arrays.toString(arr));

        int[] arr = {4,0,1,2};
        System.out.println(missingNo(arr));
    }
}
