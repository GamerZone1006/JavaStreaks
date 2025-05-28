import java.util.ArrayList;
import java.util.Arrays;

public class bubblesort {
    // public static void bubbleSort(int[] arr){
    //     boolean swapped;
    //     for(int i=0;i<arr.length;i++){
    //         swapped = false;
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 swapped = true;
    //             }
    //         }
    //         if (!swapped) {
    //             break;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // public static void q1(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // removing duplicate elements from sorted array
    public static void bs(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length - i;j++){
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // public static void duplicate(int[] arr){
    //     bs(arr);
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int i=0;i<arr.length - 1;i++){
    //         if (arr[i] != arr[i+1]) {
    //             res.add(arr[i]);
    //         }
    //     }
    //     res.add(arr[arr.length - 1]);
    //     System.out.println(res);
    // }

    // public static void bs(String[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j].length()<arr[j-1].length()) {
    //                 String temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // public static int count(int[] arr){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 count += 1;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static void main(String[] args) {
        // int[] arr = {3,2,1,5,4};
        // bubbleSort(arr);
        // int[] arr = {5, 2, 9, 1, 5, 6};
        // q1(arr);
        // int[] arr = {4, 5, 5, 2, 2, 1};
        // duplicate(arr);
        // String[] arr = {"apple", "pie", "banana", "kiwi"};
        // bs(arr);
        // int[] arr = {4, 3, 1, 2};
        // System.out.println(count(arr));
        int[] arr = {2, 0, 2, 1, 1, 0};
        bs(arr);
    }
}
