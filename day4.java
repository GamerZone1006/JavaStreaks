// import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day4 {
    // public static boolean age(int age){
    // if(age<18){
    // return false;
    // }
    // else if (age>=18) {
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    // public static int[] concat(int[] arr1, int[] arr2){
    // int n1 = arr1.length;
    // int n2 = arr2.length;
    // int[] result = new int[n1+n2];
    // System.arraycopy(arr1, 0, result, 0, n1);
    // System.arraycopy(arr2, 0, result, n1, n2);
    // return result;
    // }

    // public static int[] getConcatenation(int[] nums) {
    //     int n1 = nums.length;
    //     int[] num2 = new int[n1];
    //     for (int i = 0; i < n1; i++) {
    //         num2[i] = nums[i];
    //     }
    //     int n2 = num2.length;
    //     int[] ans = new int[n1 + n2];
    //     System.arraycopy(nums, 0, ans, 0, n1);
    //     System.arraycopy(num2, 0, ans, n1, n2);
    //     return ans;
    // }

    // public static int[] runningSum(int[] arr){
    //     int sum = 0;
    //     int[] result = new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         sum += arr[i];
    //         result[i] = sum;
    //     }
    //     return result;
    // }

    public static List<Boolean> candies(int[] candie, int extra){
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int c : candie){
            if (c>max) {
                max = c;
            }
        }
        for(int i=0;i<candie.length;i++){
            if (candie[i] + extra >= max) {
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter age: ");
        // int a = sc.nextInt();
        // if (age(a)) {
        // System.out.println("Eligible");
        // }
        // else{
        // System.out.println("Not eligible.");
        // }

        // int[] arr1 = {1,2,3,4};
        // int[] arr2 = {5,6,7,8};
        // int[] result = concat(arr1, arr2);
        // System.out.println("Concatenated string: "+Arrays.toString(result));

        // int[] arr = { 1, 2, 1 };
        // int[] ans = getConcatenation(arr);
        // System.out.println(Arrays.toString(ans));

        // int[] arr = {1,2,3,4};
        // int[] res = runningSum(arr);
        // System.out.println(Arrays.toString(res));

        int[] arr = {2,3,5,1,3};
        int extra = 3;
        System.out.println(candies(arr, extra));

        sc.close();
    }
}
