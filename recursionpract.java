import java.util.ArrayList;

public class recursionpract {

    // public static void ntoone(int n){
    // if(n==0) return;
    // System.out.println(n);
    // ntoone(n-1);
    // }

    // factorial using recursion
    // public static int fact(int n){
    // if (n<2) {
    // return 1;
    // }
    // return n*fact(n-1);
    // }

    // sum of n digits
    // public static int sumuptoN(int n){
    // if (n==1) {
    // return 1;
    // }
    // return n+sumuptoN(n-1);
    // }

    // sum of digits
    // public static int sumOfDigits(int n){
    // if (n==0) {
    // return 0;
    // }
    // return (n%10) + sumOfDigits(n/10);
    // }

    // public static int reverse(int n, int rev){
    // if (n==0) {
    // return rev;
    // }
    // return reverse(n/10, rev*10+(n%10));
    // }

    // public static boolean isPalin(int n){
    // int rev = reverse(n, 0);
    // return n==rev;
    // }

    // count number of zeros
    // public static int zeros(int n, int count){
    // if (n==0) {
    // return count;
    // }
    // if (n%10 == 0) {
    // return zeros(n/10, count+1);
    // }
    // return zeros(n/10, count);
    // }

    // counting number of steps to make a number 0
    // public static int steps(int n, int count){
    // if (n==0) {
    // return count;
    // }
    // if (n%2==0) {
    // return steps(n/2, count+1);
    // }
    // return steps(n-1, count+1);
    // }

    // public static boolean isSorted(int[] arr, int index){
    // if (index == arr.length-1) {
    // return true;
    // }
    // return arr[index]<arr[index+1] && isSorted(arr, index+1);
    // }

    // Linear Search
    // public static int ls(int[] arr, int target){
    // for(int i=0;i<arr.length;i++){
    // if (arr[i] == target) {
    // return i;
    // }
    // }
    // return -1;
    // }
    // public static int ls(int[] arr, int target, int start){
    // if (arr[start] == target) {
    // return start;
    // }
    // return ls(arr, target, start+1);
    // }

    // LS for multiple occurences
    // public static void ls(int[] arr, int target, int index){
    // ArrayList<Integer> res = new ArrayList<>();
    // if (index == arr.length) {
    // return;
    // }
    // if (arr[index] == target) {
    // res.add(index);
    // System.out.print(res);
    // }
    // ls(arr, target, index+1);
    // }

    // returning arraylist
    // public static ArrayList<Integer> ls(int[] arr, int target, int index) {
    //     ArrayList<Integer> res = new ArrayList<>();
    //     if (index == arr.length) {
    //         return res; 
    //     }
    //     if (arr[index] == target) {
    //         res.add(index); 
    //     }
    //     ArrayList<Integer> nextRes = ls(arr, target, index + 1);
    //     res.addAll(nextRes); 
    //     return res;
    // }

    //binary seach using recursion
    // public static int bs(int[] arr, int target, int start, int end){
    //     int mid = (end - start)/2 + start;
    //     if (target == arr[mid]) {
    //         return mid;
    //     }
    //     if (target<mid) {
    //         return bs(arr, target, start, mid-1);
    //     }
    //     else{
    //         return bs(arr, target, mid+1, end);
    //     }
    // }

    //rotated binary search
    // public static int rbs(int[] arr, int target, int start, int end){
    //     if (start>=end) {
    //         return -1;
    //     }
    //     int mid = (end - start)/2 +start;
    //     if (arr[mid] == target) {
    //         return mid;
    //     }
    //     if (arr[start]<=arr[mid]) {
    //         if (target>=arr[start] && target<=arr[mid]) {
    //             return rbs(arr, target, start, mid-1);
    //         }
    //         else{
    //             return rbs(arr, target, mid+1, end);
    //         }
    //     }
    //     if (target>=arr[mid] && target<=end) {
    //         return rbs(arr, target, mid+1, end);
    //     }
    //     else{
    //         return rbs(arr, target, start, mid-1);
    //     }
    // }

    // public static void tri(int row, int col){
    //     if(row==0){
    //         return;
    //     }
    //     if (col<row) {
    //         tri(row, col+1);
    //         System.out.print("*");
    //     }
    //     else{
    //         tri(row-1, 0);
    //         System.out.println();
    //     }
    // }

    //Skip a character from the string
    // public static String skip(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return p;
    //     }
    //     char ch = up.charAt(0);
    //     if (ch=='a') {
    //         skip(p, up.substring(1));
    //     }
    //     else{
    //         skip(p+ch, up.substring(1));
    //     }
    //     return p;
    // }

    //skip a string
    // public static String skipString(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return " ";
    //     }
    //     char ch = up.charAt(0);
    //     String s = "apple";
    //     if (up.startsWith(s)) {
    //         return skipString(p, up.substring(s.length()));
    //     }
    //     else{
    //         return skipString(p+ch, up.substring(1));
    //     }
    // }

    //subsets
    // public static void subsets(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     subsets(p, up.substring(1));
    //     subsets(p+ch, up.substring(1));
    // }

    //returing arraylist of subsets
    // public static ArrayList<String> subsets(String p, String up){
    //     if (up.isEmpty()) {
    //         ArrayList<String> res = new ArrayList<>();
    //         res.add(p);
    //         return res;
    //     }
    //     char ch = up.charAt(0);
    //     ArrayList<String> left = subsets(p, up.substring(1));
    //     ArrayList<String> right = subsets(p+ch, up.substring(1));
    //     left.addAll(right);
    //     return left;
    // }

    //returning ascii code also
    // public static void subsets(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     subsets(p, up.substring(1));
    //     subsets(p+ch, up.substring(1));
    //     subsets(p+(ch+0), up.substring(1));
    // }

    public static void main(String[] args) {
        // ntoone(5);
        // System.out.println(fact(5));
        // System.out.println(sumuptoN(5));
        // System.out.println(sumOfDigits(1234));
        // System.out.println(reverse(12345, 0));
        // System.out.println(isPalin(1234));
        // System.out.println(zeros(304020, 0));
        // System.out.println(steps(14, 0));
        // int[] arr = { 1, 2, 8, 5 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(ls(arr, 8, 0));
        // System.out.println(bs(arr, 8, 0, arr.length-1));
        // int[] arr = {5,6,7,8,9,1,2,3};
        // System.out.println(rbs(arr, 8, 0, arr.length-1));
        // tri(4, 0);
        // skip("", "blahblahblag");   
        // skipString("", "helloapplekitty");
        // ArrayList<String> s = subsets("", "abc");
        // System.out.println(s);
        // subsets("", "abc");
    }
}