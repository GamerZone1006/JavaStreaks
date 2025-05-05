import java.util.Arrays;

public class day9 {

    // public static int targetinChunk(int[] arr,int target){
    //     int start = 0;
    //     int end = 1;
    //     while (target>arr[end]) {
    //         int newStart = end + 1;
    //         end = end + (end - start) * 2;
    //         start = newStart;
    //         if (end > arr.length) {
    //             end = arr.length - 1;
    //             break;
    //         }
    //     }
    //     int res = binarySearch(arr, target, start, end);
    //     return res;
    // }

    // public static int binarySearch(int[] arr, int target, int start,int end){
    //     while (start<=end) {
    //         int mid = start + (end - start)/2;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if (target<arr[mid]) {
    //             end = mid - 1;
    //         }
    //         if (target>arr[mid]) {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static int peak(int[] arr){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while (end > start) {
    //         int mid = start + (end - start)/2;
    //         if (arr[mid]>arr[mid+1]) {
    //             end = mid;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return start;
    // }

    public static int[] twoDbs(int[][] mat, int target){
        int r = 0;
        int c = mat[0].length-1;
        int[] res = {-1,-1};
        while (r<mat.length && c>=0) {
            if (mat[r][c] == target) {
                res[0] = r;
                res[1] = c;
                return res;
            }
            else if(mat[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {1,3,5,7,9,12,14,16,18,20,21,23,25,27,29};
        // int target = 12;
        // System.out.println(targetinChunk(arr, target));

        // int[] mountArr = {0,1,2,3,1,0};
        // System.out.println(peak(mountArr));

        int[][] mat = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 35;
        System.out.println(Arrays.toString(twoDbs(mat, target)));
    }
}
