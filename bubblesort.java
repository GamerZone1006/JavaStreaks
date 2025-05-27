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
    // public static void bs(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    // }

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

    public static int[] strLenArr(String[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int len = arr[i].length();
            res.add(len);
        }
        int[] array = new int[res.size()];
        for(int i=0;i<res.size();i++){
            array[i] = res.get(i);
        }
        bs(array);
        return array;
    }

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

    public static void main(String[] args) {
        // int[] arr = {3,2,1,5,4};
        // bubbleSort(arr);
        // int[] arr = {5, 2, 9, 1, 5, 6};
        // q1(arr);
        // int[] arr = {4, 5, 5, 2, 2, 1};
        // duplicate(arr);
        String[] arr = {"apple", "pie", "banana", "kiwi"};
        strLenArr(arr);
    }
}
