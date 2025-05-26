public class binarysearch {
    // public static int bs(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start<=end){
    //         int mid = (end - start)/2 + start;
    //         if (arr[mid] == target) {
    //             return mid;
    //         }
    //         else if (target< arr[mid]) {
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static boolean isAesc(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     if (arr[start]<arr[end]) {
    //         return true;
    //     }
    //     return false;
    // }

    // public static int oabs(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if (isAesc(arr)) {
    //             if(target<arr[mid]) end = mid - 1;
    //             else start = mid + 1;
    //         }
    //         else{
    //             if(target>arr[mid]) end = mid - 1;
    //             else start = mid + 1;
    //         }
    //     }
    //     return - 1;
    // }

    // public static int ceiling(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return arr[start];
        // for floor of element return arr[end];
    // }

    public static char ceil(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start<=end) {
            int mid = (end - start)/2 + start;
            if(target<letters[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        // int[] arr = {2,3, 13, 17, 20, 23, 34, 55, 78};
        // int target = 16;
        // int res = bs(arr, target);
        // int res = oabs(arr, target);
        // int res = ceiling(arr, target);
        // System.out.println(res);
        char[] letter = {'c','f','j'};
        char target = 'a';
        char res = ceil(letter, target);
        System.out.println(res);
    }
}
