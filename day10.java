import java.util.Arrays;

public class day10 {

    // public static void bubbleSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j-1]>arr[j]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    // }

    // public static int maxIndex(int[] arr,int last){
    //     int max = 0;
    //     for(int i=0;i<=last;i++){
    //         if (arr[i] > arr[max]) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // public static void selectionSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int last = arr.length - i - 1;
    //         int maxIn = maxIndex(arr, last);
    //         swap(arr, maxIn, last);
    //     }
    // }   
    
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        // bubbleSort(arr);

        // selectionSort(arr);

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
