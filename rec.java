// import java.util.Scanner;

import java.util.ArrayList;

public class rec {

    // function that takes a numbera and prints it
    // public static void printNo(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     System.out.println(n);
    //     sc.close();
    // }

    // Binary search using recursion
    // public static int bs(int[] arr, int target, int start, int end){
    //     if (start>end) {
    //         return -1;
    //     }
    //     int mid = (end-start)/2 + start;
    //     if (target == arr[mid]) {
    //         return mid;
    //     }
    //     if (target<arr[mid]) {
    //         return bs(arr, target, start, mid-1);
    //     }
    //     else{
    //         return bs(arr, target, mid+1, end);
    //     }
    // }

    //fibonacci
    // public static int fibo(int n){
    //     if (n<2) {
    //         return n;
    //     }
    //     return fibo(n-1) + fibo(n-2);
    // }

    //factorial using recursion
    // public static int fact(int n){
    //     if (n<2) {
    //         return 1;
    //     }
    //     return n*fact(n-1);
    // }

    //sum of n numbers
    // public static int sum(int n){
    //     if (n<1) {
    //         return n;
    //     }
    //     return n+sum(n-1);
    // }

    // public static int sumOfDig(int n){
    //     if (n==0) {
    //         return 0;
    //     }
    //     return (n%10) + sumOfDig(n/10);
    // }

    // public static int prodOfDigits(int n){
    //     if (n==0) {
    //         return 1;
    //     }
    //     return (n%10) * prodOfDigits(n/10);
    // }

    // public static int reverse(int n,int rev){
    //     if (n==0) {
    //         return rev;
    //     }
    //     return reverse(n/10, rev*10 + n%10);
    // }

    // public static boolean isPalin(int n, int rev){
    //     rev = reverse(n, 0);
    //     return n == rev;
    // }

    // public static int zeros(int n, int count){
    //     if (n==0) {
    //         return count;
    //     }
    //     int rem = n%10;
    //     if (rem == 0) {
    //         return zeros(n/10, count+1);
    //     }   
    //     else{
    //         return zeros(n/10, count);
    //     }
    // }

    // public static boolean isSorted(int[] arr, int index){
    //     if (index == arr.length-1) {
    //         return true;
    //     }
    //     return arr[index] < arr[index+1] && isSorted(arr, index+1);
    // }

    // public static int ls(int[] arr, int target, int index){
    //     if (index == arr.length) {
    //         return -1;
    //     }
    //     if (target == arr[index]) {
    //         return index;
    //     }
    //     return ls(arr, target, index+1);
    // }

    // public static void mls(int[] arr, int target, int index){
    //     if (index == arr.length) {
    //         return;
    //     }
    //     ArrayList<Integer> res = new ArrayList<>();
    //     if (target == arr[index]) {
    //         res.add(index);
    //         System.out.print(res);
    //     }
    //     mls(arr, target, index+1);
    // }

    public static ArrayList<Integer> alls(int[] arr, int target, int index, ArrayList<Integer> list){
        if(target == arr.length){
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return alls(arr, target, index+1, list);
    }

    public static void main(String[] args) {
        // printNo();
        // int[] arr = {2,4,5,8,22,74,56};
        // System.out.println(bs(arr, 34, 0, arr.length-1));
        // System.out.println(fibo(5));
        // System.out.println(fact(5));
        // System.out.println(sum(100));
        // System.out.println(sumOfDig(12345));
        // System.out.println(prodOfDigits(505));
        // System.out.println(reverse(12305, 0));
        // System.out.println(isPalin(12345421, 0));
        // System.out.println(zeros(12345, 0));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(ls(arr, 74, 0));
        // int[] arr = {1,2,2,2,2,2,3,4,5};
        // mls(arr, 2, 0);
    }
}
