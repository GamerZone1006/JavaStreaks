import java.util.ArrayList;
import java.util.Arrays;

public class sortingquestions {

    //Q1
    // public static void mergeNsort(int[] n1, int[] n2, int m, int n){
        // int[] arr = new int[m+n];
        // System.arraycopy(n1, 0, arr, 0, m);
        // System.arraycopy(n2, 0, arr, m, n);
        // boolean swapped;
        // for(int i=0;i<arr.length;i++){
        //     swapped = false;
        //     for(int j=1;j<arr.length - i;j++){
        //         if(arr[j]<arr[j-1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //         }
        //     }
        //     if (!swapped) {
        //         break;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

    //     for(int i=0;i<n;i++){
    //         n1[m+i] = n2[i];
    //     }
    //     for(int i=0;i<n1.length;i++){
    //         for(int j=1;j<n1.length-i;j++){
    //             if(n1[j]<n1[j-1]){
    //                 int temp = n1[j];
    //                 n1[j] = n1[j-1];
    //                 n1[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(n1));
    // }

    // public static boolean duplicate(int[] arr){
        // int i=0;
        // while (i<arr.length) {
        //     int correct = arr[i] - 1;
        //     if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
        //         int temp = arr[i];
        //         arr[i] = arr[correct];
        //         arr[correct] = temp;
        //     }
        //     else{i++;}
        // }
        // for(int j=0;j<arr.length;j++){
        //     if (arr[j] != j+1) {
        //         // System.out.println(arr[j]);
        //         return true;
        //     }
        // }
        // return false;

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length - i;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    //     for(int j=1;j<arr.length;j++){
    //         if (arr[j] == arr[j-1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static int missingNumber(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correct = arr[i];
    //         if (arr[i]>=0 && arr[i]<arr.length && arr[i] != arr[correct]) {
    //             int temp = arr[i];
    //             arr[i] = arr[correct];
    //             arr[correct] = temp;
    //         }else{i++;}
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         if (arr[j] != j) {
    //             return j;
    //         }
    //     }
    //     return arr.length-1;
    // }

    // public static ArrayList<Integer> intersection(int[] a1, int[] a2){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     int i=0;
    //     while (i<a1.length) {
    //         int j=0;
    //         while (j<a2.length) {
    //             if (a1[i] == a2[j]) {
    //                 res.add(a1[i]);
    //                 break;
    //             }
    //             j++;
    //         }
    //         i++;
    //     }
    //     return res;
    // }

    public static int[] twoSum(int[] arr, int target){
        int[] res = {-1,-1};
        int i=0;
        while (i<arr.length) {
            int j=1;
            while (j<arr.length) {
                if (arr[i]+arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
                j++;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] n1 = {1,2,3,0,0,0};
        // int[] n2 = {2,5,6};
        // int m=3;
        // int n= 3;
        // int[] n1 = {1};
        // int[] n2 = {};
        // mergeNsort(n1, n2, m, n);
        // int[] arr = {1,2,3,1};
        // System.out.println(duplicate(arr));
        // int[] arr = {3,0,1};
        // System.out.println(missingNumber(arr));
        // int[] n1 = {4,9,5};
        // int[] n2 = {9,4,9,8,4};
        // ArrayList<Integer> res = intersection(n1, n2);
        // System.out.println(res);
        int[] arr = {3,3};
        int target = 6;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
