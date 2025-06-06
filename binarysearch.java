import java.util.ArrayList;

public class binarysearch {
    public static int bs(int[] arr, int target, int start, int end){
        start = 0;
        end = arr.length - 1;
        while(start<=end){
            int mid = (end - start)/2 + start;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target< arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

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

    // public static char ceil(char[] letters, char target){
    //     int start = 0;
    //     int end = letters.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if(target<letters[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return letters[start % letters.length];
    // }

    // public static ArrayList<Integer> aagePeeche(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (start<= end) {
    //         int mid = (end - start)/2 + start;
    //         int peeche = arr.length - mid;
    //         if (arr[mid] == target) {
    //             res.add(mid);
    //             res.add(peeche);
    //         }
    //         if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return res;
    // }

    // public static ArrayList<Integer> occur(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int first = -1;
    //     int last = -1;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             first = mid;
    //             end = mid - 1;
    //         }
    //         else if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     start = 0;
    //     end = arr.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             last = mid;
    //             start = mid + 1;
    //         }
    //         else if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     res.add(first);
    //     res.add(last);
    //     return res;
    // }

    public static int infArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target<arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return bs(arr, target, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {2,3, 13, 17, 20, 23, 34, 55, 78};
        // int target = 16;
        // int res = bs(arr, target);
        // int res = oabs(arr, target);
        // int res = ceiling(arr, target);
        // System.out.println(res);
        // char[] letter = {'c','f','j'};
        // char target = 'a';
        // char res = ceil(letter, target);
        // System.out.println(res);
        // int target = 17;
        // ArrayList<Integer> res = aagePeeche(arr, target);
        // int[] arr = {1, 1, 1, 2, 2, 2, 2, 2};
        // int target = 2;
        // ArrayList<Integer> res = occur(arr, target);
        int target = 55;
        int res = infArray(arr, target);
        System.out.println(res);
    }
}
