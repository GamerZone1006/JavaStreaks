import java.util.Arrays;

public class day8 {
    // public static int linearSearch(int[] arr, int target){
    // int elem = arr[0];
    // for(int i=0;i<arr.length;i++){
    // if (arr[i] == target) {
    // elem = i;
    // }
    // }
    // return elem;
    // }

    // public static int binarySearch(int[] arr, int target){
    // int start = 0;
    // int end = arr.length-1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (target<arr[mid]) {
    // end = mid - 1;
    // }
    // else if (target>arr[mid]) {
    // start = mid + 1;
    // }
    // else{
    // return mid;
    // }
    // }
    // return -1;
    // }

    // public static int ceiling(int[] arr,int target){
    // int start = 0;
    // int end = arr.length-1;
    // while (start<=end) {
    // int mid = start +(end - start)/2;
    // if (target == arr[mid]) {
    // return mid;
    // }
    // if (target<arr[mid]) {
    // end = mid -1;
    // }
    // if (target> arr[mid]) {
    // start = mid+1;
    // }
    // }
    // return arr[start];
    // }

    // public static int floor(int[] arr,int target){
    // int start = 0;
    // int end = arr.length - 1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (target == arr[mid]) {
    // return arr[mid];
    // }
    // if (target<arr[mid]) {
    // end = mid - 1;
    // }
    // if (target>arr[mid]) {
    // start = mid + 1;
    // }
    // }
    // return arr[end];
    // }

    // public static char ceilingofchar(char[] arr, int target){
    // int start = 0;
    // int end = arr.length - 1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (target == arr[mid]) {
    // return arr[mid];
    // }
    // if (target<arr[mid]) {
    // end = mid - 1;
    // }
    // if (target>arr[mid]) {
    // start = mid + 1;
    // }
    // }
    // return arr[start];
    // }

    public static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int[] resultRange(int[] arr, int target) {
        int[] res = { -1, -1 };
        res[0] = firstIndex(arr, target);
        res[1] = lastIndex(arr, target);
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {-7, 3, 14, 28, 32};
        // int target = -7;
        // System.out.println(target + " is present at "+binarySearch(arr, target));

        // int[] arr = {8, 12, 14, 16, 20};
        // int target = 15;
        // System.out.println(ceiling(arr, target));
        // System.out.println(floor(arr, target));

        int[] arr = { 4, 7, 7, 7, 7, 13, 18 };
        int target = 7;
        System.out.println(Arrays.toString(resultRange(arr, target)));
    }
}