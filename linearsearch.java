import java.util.ArrayList;
import java.util.Arrays;

public class linearsearch {
    // public static int ls(int[] arr, int target){
    // for(int i=0;i<arr.length;i++){
    // if (target == arr[i]) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static boolean ls(String s, char target){
    // if (s.length()==0) {
    // return false;
    // }
    // for(int i=0;i<s.length();i++){
    // if (target == s.charAt(i)) {
    // return true;
    // }
    // }
    // return false;
    // }

    // public static int min(int[] arr){
    // int min = 0;
    // for(int i=0;i<arr.length;i++){
    // if (arr[i]<min) {
    // min = arr[i];
    // }
    // }
    // return min;
    // }

    // public static int[] ls(int[][] arr, int target){
    // int[] res = {-1, -1};
    // for(int i=0;i<arr.length;i++){
    // for(int j=0;j<arr[i].length;j++){
    // if (target == arr[i][j]) {
    // res = new int[]{i, j};
    // }
    // }
    // }
    // return res;
    // }

    public static boolean isSumEven(int n) {
        int count = 0;
        while (n>0) {
            count++;
            n /= 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> isEvenDig(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isSumEven(arr[i])) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        // int target = -11;
        // int ans = ls(arr, target);
        // System.out.println(ans);

        // String s = "Anushka";
        // char target = 'u';

        // int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        // System.out.println("Minimum: "+min(arr));

        // int[][] arr = {
        // {23, 4, 1},
        // {18, 12, 3, 9},
        // {18, 12}
        // };
        // int target = 3;
        // int[] res = ls(arr, target);
        // System.out.println(Arrays.toString(res));

        int[] arr = { 12, 345, 6, 7896 };
        ArrayList<Integer> res = isEvenDig(arr);
        System.out.println(res);
    }
}
