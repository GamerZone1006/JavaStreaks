import java.util.Arrays;

public class leetcode {

    //roman to integer
    // public static int getValue(char ch){
    //     switch (ch) {
    //         case 'I':
    //             return 1;
    //         case 'V':
    //             return 5;
    //         case 'X':
    //             return 10;
    //         case 'L':
    //             return 50;
    //         case 'C':
    //             return 100;
    //         case 'D':
    //             return 500;
    //         case 'M':
    //             return 1000;
    //         default:
    //             return 0;
    //     }
    // }
    // public static int rtoInt(String s){
    //     int res = 0;
    //     int pre = 0;
    //     for(int i=s.length()-1;i>=0;i--){
    //         int rom = getValue(s.charAt(i));
    //         if (rom<pre) {
    //             res -= rom;
    //         }
    //         else{
    //             res += rom;
    //         }
    //         pre = rom;
    //     }
    //     return res;
    // }

    //remove count duplicates
    
    // public static int dup(int[] arr){
    //     if (arr.length == 0) {
    //         return 0;
    //     }
    //     int i=0;
    //     for(int j=1;j<arr.length;j++){
    //         if (arr[j] != arr[i]) {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }
    //     return i+1;
    // }

    // public static int removeElement(int[] arr, int value){
    //     int i=0;
    //     int n=arr.length;
    //     while (i<n) {
    //         if (arr[i] == value) {
    //             arr[i] = arr[n-1];
    //             n--;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     return n;
    // }

    // public static int removeElement(int[] arr, int value){
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         if (value == arr[i]) {
    //             int temp = arr[i];
    //             arr[i] = arr[n-1];
    //             arr[n-1] = temp;
    //             n--;
    //         }
    //     }
    //     return n;
    // }

    //search for occurence of a string in a string and return starting index
    // public static int needleHaystick(String haystick, String needle){
    //     return haystick.indexOf(needle); 
    // }

    // public static int divide(int divident, int divisor){
    //     return (int) divident/divisor;
    // }

    //three sum
    public static int[] threeSum(int[] arr, int target){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1; j<arr.length-1;j++){
                for(int k=j+1;i<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k] == target) {
                        return new int[]{i,j,k};
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }

    public static void main(String[] args) {
        // System.out.println(rtoInt("II"));
        // int[] arr = {1, 1, 2, 2, 4, 5, 3};
        // System.out.println(dup(arr));
        // int value = 2;
        // System.out.println(removeElement(arr, value));
        // System.out.println(needleHaystick("iamsad", "sad"));
        // System.out.println(divide(10, 3));
        int[] arr = {2,32,4,5,10, 6};
        System.out.println(Arrays.toString(threeSum(arr, 40)));
    }
}
