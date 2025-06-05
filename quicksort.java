import java.util.Arrays;

public class quicksort {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void qs(int[] arr, int low, int high){
        if (low>=high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = (high - low)/2 + low;
        int pivot = arr[mid];
        while (start<=end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start<=end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        qs(arr, low, end);
        qs(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}