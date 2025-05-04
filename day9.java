public class day9 {

    public static int targetinChunk(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]) {
            int newStart = end + 1;
            end = end + (end - start) * 2;
            start = newStart;
            if (end > arr.length) {
                end = arr.length - 1;
                break;
            }
        }
        int res = binarySearch(arr, target, start, end);
        return res;
    }

    public static int binarySearch(int[] arr, int target, int start,int end){
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target<arr[mid]) {
                end = mid - 1;
            }
            if (target>arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,14,16,18,20,21,23,25,27,29};
        int target = 12;
        System.out.println(targetinChunk(arr, target));
    }
}
