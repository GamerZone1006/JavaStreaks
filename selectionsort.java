import java.util.Arrays;

public class selectionsort {
    // public static int max(int[] arr, int start, int end) {
    //     int max = start;
    //     for (int i = start; i < end; i++) {
    //         if (arr[max] < arr[i]) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }

    // public static void swap(int[] arr, int first, int last) {
    //     for (int i = 0; i < arr.length; i++) {
    //         int temp = arr[first];
    //         arr[first] = arr[last];
    //         arr[last] = temp;
    //     }
    // }

    // public static void ss(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         int last = arr.length - i - 1;
    //         int maxInd = max(arr, 0, last);
    //         swap(arr, maxInd, last);
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // Sorting in descending order
    public static int getMin(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void desc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int minInd = getMin(arr, 0, last);
            swap(arr, minInd, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // int[] arr = {3,4,2,5,1};
        // ss(arr);
        int[] arr = { 3, 10, 4, 2 };
        desc(arr);
    }
}
