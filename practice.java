import java.util.Arrays;

public class practice {

    //armstrong number using recursion
    // public static int armstrong(int n){
    //     if (n==0) {
    //         return 0;
    //     }
    //     int i=n%10;
    //     int cube = i*i*i;
    //     return cube + armstrong(n/10);
    // }
    // public static boolean isArm(int n){
    //     return n == armstrong(n);
    // }

    //printing n to 1 using recursion
    // public static void ntoone(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     ntoone(n-1);
    // }

    //factorial using recursion
    // public static int factorial(int n){
    //     if (n<2) {
    //         return 1;
    //     }
    //     return n*factorial(n-1);
    // }

    //sum of digits using recursion
    // public static int sumOfDigits(int n){
    //     if (n==0) {
    //         return n;
    //     }
    //     return (n%10) + sumOfDigits(n/10);
    // }

    //product of digits
    // public static int prodofDigits(int n){
    //     if (n<=1) {
    //         return n;
    //     }
    //     return (n%10) * prodofDigits(n/10);
    // }

    //reverse a number
    // public static int reverse(int n, int rev){
    //     if (n<1) {
    //         return rev;
    //     }
    //     return reverse(n/10, rev*10+(n%10));
    // }

    // public static boolean isPalin(int n){
    //     return n == reverse(n, 0);
    // }

    //no of zeros
    // public static int noofzeros(int n, int count){
    //     if (n<1) {
    //         return count;
    //     }
    //     if (n%10==0) {
    //         return noofzeros(n/10, count+1);
    //     }
    //     return noofzeros(n/10, count);
    // }

    //no of steps to make 0
    // public static int steps(int n, int step){
    //     if (n<1) {
    //         return step;
    //     }
    //     if (n%2==0) {
    //         return steps(n/2, step+1);
    //     }
    //     return steps(n-1, step+1);
    // }

    // public static void bow(int n){
    //     printUpper(n,1);
    //     printLower(n,n-1);
    // }

    // public static void printUpper(int n, int i){
    //     if (i>n) {
    //         return;
    //     }
    //     int stars = i;
    //     int spaces = 2*(n-i);
    //     printChars("*", stars);
    //     printChars(" ", spaces);
    //     printChars("*", stars);
    //     System.out.println();
    //     printUpper(n, i+1);
    // }

    // public static void printLower(int n, int i){
    //     if (i==0) {
    //         return;
    //     }
    //     int stars = i;
    //     int spaces = 2*(n-i);
    //     printChars("*", stars);
    //     printChars(" ", spaces);
    //     printChars("*", stars);
    //     System.out.println();
    //     printLower(n, i-1);
    // }

    // public static void printChars(String ch, int count){
    //     if (count==0) {
    //         return;
    //     }
    //     System.out.print(ch);
    //     printChars(ch, count-1);
    // }

    // public static void hollowDiamond(int n){
    //     printUpper(n, 1);
    //     printLower(n, n-1);
    // }

    // public static void printUpper(int n, int i){
    //     int stars = n-i+1;
    //     int spaces = i-1;
    //     printChars("*", stars);
    //     printChars(" ", spaces);
    //     printChars("*", stars);
    //     System.out.println();
    //     printUpper(n, i+1);
    // }

    // public static void printLower(int n, int i){
    //     int stars = n-i+1;
    //     int spaces = i-1;
    //     printChars("*", stars);
    //     printChars(" ", spaces);
    //     printChars("*", stars);
    //     System.out.println();
    //     printLower(n, i+1);
    // }

    // public static void printChars(String ch, int count){
    //     if (count == 0) {
    //         return;
    //     }
    //     System.out.print(ch);
    //     printChars(ch, count-1);
    // }

    // public static int[] twoSum(int[] arr, int target) {
    //     int[] res = new int[2];
    //     for(int i=0;i<=arr.length - 1;i++){
    //         for(int j=1;j<arr.length - 1;j++){
    //             if(arr[i]+arr[j] == target){
    //                 res[0] = i;
    //                 res[1] = j;
    //             }
    //         }
    //     }
    //     return res;
    // }

    public static int[] twoSum(int[] arr, int target){
        return helper(arr, target, 0, 1);
    }
    public static int[] helper(int[] arr, int target, int i, int j){
        if (i>arr.length) {
            return new int[]{};
        }
        if(j>=arr.length){
            return helper(arr, target, i+1, j+2);
        }
        if (target == arr[i]+arr[j]) {
            return new int[]{i, j};
        }
        return helper(arr, target, i, j+1);
    }

    public static void main(String[] args) {
        // System.out.println(isArm(111));
        // ntoone(5);
        // System.out.println(factorial(5));
        // System.out.println(sumOfDigits(12345));
        // System.out.println(prodofDigits(12345));
        // System.out.println(reverse(12034, 0));
        // System.out.println(isPalin(40404));
        // System.out.println(noofzeros(304020, 0));
        // System.out.println(steps(14, 0));
        // bow(5);
        // hollowDiamond(5);
        int[] arr = {3,3};
        int[] res = twoSum(arr, 6);
        System.out.println(Arrays.toString(res));
    }
}
