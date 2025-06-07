import java.util.Arrays;
import java.util.ArrayList;

public class recursionquestions {

    // public static void nokia(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     int digit = up.charAt(0) - '0';
    //     for(int i=(digit-1)*3;i<digit*3;i++){
    //         char ch = (char) ('a' + i);
    //         nokia(p+ch, up.substring(1));
    //     }
    // }

    //using ArrayList
    // public static ArrayList<String> nokia(String p, String up){
    //     if (up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     ArrayList<String> res = new ArrayList<>();
    //     int digit = up.charAt(0) - '0';
    //     for(int i=(digit-1)*3; i<digit*3;i++){
    //         char ch = (char) ('a'+i);
    //         res.addAll(nokia(p+ch, up.substring(1)));
    //     }
    //     return res;
    // }

    //returning the count
    // public static int nokia(String p, String up){
    //     if (up.isEmpty()) {
    //         return 1;
    //     }
    //     int digit = up.charAt(0) - '0';
    //     int count = 0;
    //     for(int i=(digit-1)*3; i<digit*3; i++){
    //         char ch = (char) ('a' + i);
    //         count += nokia(p+ch, up.substring(1));
    //     }
    //     return count;
    // }

    // public static void diceSum(String p, int target){
    //     if (target == 0) {
    //         System.out.println(p);
    //         return;
    //     }
    //     for(int i=1;i<=target; i++){
    //         diceSum(p+i, target-i);
    //     }
    // }

    // public static void sumTri(int[] arr){
    //     if (arr.length == 1) {
    //         System.out.println(Arrays.toString(arr));
    //         return;
    //     }
    //     int[] temp = new int[arr.length-1];
    //     for(int i=0;i<arr.length-1;i++){
    //         int x = arr[i] + arr[i+1];
    //         temp[i] = x;
    //     }
    //     sumTri(temp);
    //     System.out.println(Arrays.toString(arr));
    // }

    //getting min max element from the array
    // public static ArrayList<Integer> minMax(int[] arr, int n){
    //     if (n==1) {
    //         ArrayList<Integer> list = new ArrayList<>();
    //         list.add(arr[0]);
    //         return list;
    //     }
    //     ArrayList<Integer> res = new ArrayList<>();
    //     int minimum = Math.min(arr[n-1], minMax(arr, n-1));
    //     int maximum = Math.max(arr[n-1], minMax(arr, n-1));
    //     res.add(minimum);
    //     res.add(maximum);
    //     return res;
    // }

    //bs using recursion
    // public static int search(int[] arr, int target, int start, int end) {
    //     if(start>end){
    //         return -1;
    //     }
    //     int mid = (end - start)/2 + start;
    //     if(target==arr[mid]){
    //         return mid;
    //     }
    //     if(target<arr[mid]){
    //         return search(arr, target, start, mid-1);
    //     }
    //     if(target>arr[mid]){
    //         return search(arr, target, mid+1, end);
    //     }
    //     return -1;
    // }

    //finding the first character in uppercase
    // public static void upcase(String s, int i){
    //     if (i==s.length()) {
    //         return;
    //     }
    //     if(Character.isUpperCase(s.charAt(i))){
    //         System.out.println(s.charAt(i));
    //     }
    //     upcase(s, i+1);
    // }

    //reverse string
    // public static String rev(String s, int i){
    //     if (i==s.length()) {
    //         return "";
    //     }
    //     char ch = s.charAt(1);
    //     String rest = rev(s, i+1);
    //     if (Character.isUpperCase(i)) {
    //         return ch + rest;
    //     }
    //     else{
    //         return rest;
    //     }
    // }

    //fibonacci series
    // public static int fibo(int n){
    //     if (n<2) {
    //         return 1;
    //     }
    //     return fibo(n-1) + fibo(n-2);
    // }

    //sum of digits
    // public static int soD(int n){
    //     if (n==0) {
    //         return 0;
    //     }
    //     return n%10 + soD(n/10);
    // }

    //product of 2 numbers
    // public static int prod(int a, int b){
    //     if (b==0) {
    //         return 0;
    //     }
    //     return a + prod(a, b-1);
    // }

    // public static boolean isPrime(int n){
    //     if (n<1) {
    //         return false;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if (n%i==0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //using recursion
    // public static boolean isPrime(int n, int i){
    //     if (i<2) {
    //         return false;
    //     }
    //     if (n%i == 0) {
    //         return false;
    //     }
    //     isPrime(n, (int) Math.sqrt(i));
    //     return true;
    // }

    //sum of natural number 
    // public static int sumOfNatNos(int n, int sum){
    //     if (n==0) {
    //         return 0;
    //     }
    //     sum += n + sumOfNatNos(n-1, sum);
    //     return sum;
    // }

    //return true if the number is a power of 2
    // public static boolean isPowOfTwo(int n){
    //     if (n==1) {
    //         return true;
    //     }
    //     if (n%2 != 0) {
    //         return false;
    //     }
    //     return isPowOfTwo(n/2);
    // }

    //power of three
    // public static boolean isPwoOfThree(int n){
    //     if (n==1) {
    //         return true;
    //     }
    //     if (n%3!=0) {
    //         return false;
    //     }
    //     return isPwoOfThree(n/3);
    // }

    //power of four
    // public static boolean isPowOfFour(int n){
    //     if (n==1) {
    //         return true;
    //     }
    //     if (n%4 != 0) {
    //         return false;
    //     }
    //     return isPowOfFour(n/4);
    // }

    //factorial of a number
    // public static int fact(int n){
    //     if (n<2) {
    //         return 1;
    //     }
    //     return n*fact(n-1);
    // }

    //recursive function to check if the array is sorted or not
    // public static boolean isSorted(int[] arr, int i){
    //     if (i==arr.length-1) {
    //         return true;
    //     }
    //     if (arr[i]>arr[i+1]) {
    //         return false;
    //     }
    //     return isSorted(arr, i+1);
    // }

    //counting steps to reduce a number to zero
    // public static int counting(int n, int count){
    //     if (n==0) {
    //         return count;
    //     }
    //     if (n%2 == 0) {
    //         return counting(n/2, count+1);
    //     }
    //     else{
    //         return counting(n-1, count+1);
    //     }
    // }

    //balanced parenthesis
    // public static char closingParen(int arr){
    //         if(arr == '(') return ')';
    //         if(arr == '{') return '}';
    //         if(arr == '[') return ']';
    //     return Character.MIN_VALUE;
    // }
    // public static boolean check(int[] arr, int n){
    //     if (n==0) {
    //         return true;
    //     }
    //     if (n==1) {
    //         return false;
    //     }
    //     if (arr[0]==')' || arr[0]=='}' || arr[0]==']') {
    //         return false;
    //     }
    //     char closing = closingParen(arr[0]);
    //     int i, count = 0;
    //     for(i=1;i<n;i++){
    //         if (arr[0] == arr[i]) {
    //             count++;
    //         }
    //         if (arr[i] == closing) {
    //             if (count == 0) {
    //                 break;
    //             }
    //             count--;
    //         }
    //     }
    //     if (i==n) {
    //         return false;
    //     }
    // }

    //skip duplicate charcter
    public static String duplicate(String p, String up, int index){
        if (index >= up.length()-1) {
            return p+up.charAt(index);
        }
        char ch = up.charAt(index);
        if (ch == up.charAt(index+1)) {
            return duplicate(p, up, index+1);
        }
        else{
            return duplicate(p+ch, up, index+1);
        }
    }
    
    public static void main(String[] args) {
        // nokia("", "12");
        // System.out.println(nokia("", "12"));
        // diceSum("", 1);
        // int[] arr = {1,2,3,7,5};
        // sumTri(arr);
        // System.out.println(minMax(arr, arr.length));
        // System.out.println(search(arr, 3, 0, arr.length));
        // upcase("bleeeEh", 0);
        // System.out.println(rev("heyya", 0));
        // System.out.println(fibo(5));
        // System.out.println(soD(125));
        // System.out.println(prod(5, 4));
        // System.out.println(isPrime(24,2));
        // System.out.println(sumOfNatNos(100, 0));
        // System.out.println(isPowOfTwo(24));
        // System.out.println(isPwoOfThree(18));
        // System.out.println(isPowOfFour(24));
        // System.out.println(fact(5));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(counting(7, 0));
        System.out.println(duplicate("", "aaaaabbbbcccd", 0));
    }
}
