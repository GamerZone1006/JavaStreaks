import java.util.ArrayList;

public class recursion3arr {

    // public static boolean isSorted(int[] arr, int index){
    //     if (index == arr.length - 1) {
    //         return true;
    //     }
    //     return arr[index]<arr[index+1] && isSorted(arr, index+1);
    // }

    //linear search using recursion
    // public static int ls(int[] arr, int target, int index){
    //     if (index == arr.length - 1) {
    //         return index;
    //     }
    //     if (arr[index] == target) {
    //         return index;
    //     }
    //     return ls(arr, target, index+1);
    // }

    //linear search on multiple ocurrences
    // public static void multipleLS(int[] arr, int target, int index){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     if (index == arr.length - 1) {
    //         return;
    //     }
    //     if (arr[index]==target) {
    //         res.add(index);
    //         System.out.println(res);
    //     }
    //     multipleLS(arr, target, index+1);
    // }

    //return arraylist of index and target element
    // public static ArrayList<Integer> lists(int[] arr, int target, int index, ArrayList<Integer> list){
    //     if(index == arr.length){
    //         return list;
    //     }
    //     if (target == arr[index]) {
    //         list.add(index);
    //     }
    //     return lists(arr, target, index+1, list);
    // }

    //return arraylist of index and target element with taking argument
    // public static ArrayList<Integer> lists(int[] arr, int target, int index){
    //     if (index == arr.length) {
    //         return new ArrayList<>();
    //     }
    //     ArrayList<Integer> list = lists(arr, target, index+1);
    //     if (target == arr[index]) {
    //         list.add(index);
    //     }
    //     return list;
    // }

    //rotated binary search using recursion
    // public static int rbs(int[] arr, int target, int start, int end){
    //     if (start>end) {
    //         return -1;
    //     }
    //     int mid = (end - start)/2 + start;
    //     if (arr[mid] == target) {
    //         return mid;
    //     }
    //     if (arr[start]<=arr[mid]) {
    //         if (target>=arr[start] && target<=arr[mid]) {
    //             return rbs(arr, target, start, mid-1);
    //         }
    //         else{
    //             return rbs(arr, target, mid+1, end);
    //         }
    //     }
    //     else{
    //         if (target>=arr[mid] && target<=arr[end]) {
    //             return rbs(arr, target, mid+1, end);
    //         }
    //         else{
    //             return rbs(arr, target, start, mid-1);
    //         }
    //     }
    // }

    //square stars
    // public static void sqStars(int row, int col, int n){
    //     if (row == n) {
    //         return;
    //     }
    //     if (col<n) {
    //         System.out.print("* ");
    //         sqStars(row, col+1, n);
    //     }
    //     else{
    //         System.out.println();
    //         sqStars(row+1, 0, n);
    //     }
    // }

    //reversed triange using recursion
    // public static void revTri(int row, int col, int n){
    //     if (row==n) {
    //         return;
    //     }
    //     if (col<n-row) {
    //         System.out.print("* ");
    //         revTri(row, col+1, n);
    //     }
    //     else{
    //         System.out.println();
    //         revTri(row+1, 0, n);
    //     }
    // }

    //normal triangel
    public static void tri(int row, int col, int n){
        if (row == n) {
            return;
        }
        if (col<=row) {
            System.out.print("* ");
            tri(row, col+1, n);
        }
        else{
            System.out.println();
            tri(row+1, 0, n);
        }
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,0,7,8};
        // System.out.println(isSorted(arr, 0));
        // int target = 8;
        // System.out.println(ls(arr, target, 0));
        // int[] arr = {1,2,3,2,4,3,2,2,5};
        // int target = 2;
        // multipleLS(arr, target, 0);
        // int[] arr = {1,2,3,4,4,8};
        // ArrayList<Integer> ans = lists(arr, 4, 0);
        // System.out.println(ans);
        // int[] arr = {5,6,7,8,9,1,2,3};
        // System.out.println(rbs(arr, 1, 0, arr.length-1));
        // sqStars(0, 0, 5);
        // revTri(0, 0, 5);
        tri(0, 0, 5);
    }
}
