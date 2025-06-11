import java.util.ArrayList;
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
    // public static int[] threeSum(int[] arr, int target){
    //     for(int i=0;i<arr.length-2;i++){
    //         for(int j=i+1; j<arr.length-1;j++){
    //             for(int k=j+1;i<arr.length;k++){
    //                 if (arr[i]+arr[j]+arr[k] == target) {
    //                     return new int[]{i,j,k};
    //                 }
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1,-1};
    // }

    //leetcode 35. search insert position
    // public static int searchIndex(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while (start<end) {
    //         int mid = (end-start)/2 + start;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if (target<arr[mid]) {
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return start+1;
    // }

    //returning weight of last word 
    // public static int lengthofLastWord(String s){
    //     String[] arr = s.split(" ");
    //     String last = arr[arr.length - 1];
    //     return last.length();
    // }

    //adding one and returning to the array
    // public static int[] plusOne(int[] arr){
    //     int num = 0;
    //     for(int i=0;i<arr.length;i++){
    //         num = num*10 + arr[i];
    //     }
    //     num += 1;
    //     String number = Integer.toString(num);
    //     String[] array = number.split("");
    //     int[] finalArr = new int[array.length];
    //     for(int i=0;i<arr.length;i++){
    //         finalArr[i] = Integer.parseInt(array[i]);
    //     }
    //     return finalArr;
    // }

    // public static int[] plusOne(int[] digits){
    //     for(int i=digits.length-1;i>=0;i--){
    //         if (digits[i]<9) {
    //             digits[i]++;
    //             return digits;
    //         }
    //         digits[i] = 0;
    //     }
    //     int[] res = new int[digits.length+1];
    //     res[0] = 1;
    //     return res; 
    // }

    //square root
    // public static int sqrt(int n){
        // if (n==0 || n==1) {
        //     return n;
        // }
        // for(int i=0;i<=n;i++){
        //     if (i*i == n) {
        //         return i;
        //     }
        //     else if(i*i>n){
        //         return i-1;
        //     }
        // }
        // return -1;
    // }

    //merge sorted arrays
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     for(int i=0;i<n;i++){
    //         nums1[m+i] = nums2[i];
    //     }
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=1;j<nums1.length - i;j++){
    //             if (nums1[j]<nums1[j-1]) {
    //                 int temp = nums1[j];
    //                 nums1[j] = nums1[j-1];
    //                 nums1[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(nums1));
    // }

    // public static boolean isPalin(String s){
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        // s = s.toLowerCase();
        // int n = s.length();
        // for(int i=0;i<n/2;i++){
        //     if (s.charAt(i) != s.charAt(n-1-i)) {
        //         return false;
        //     }
        // }
        // return true;

        // char[] charArr = new char[s.length()];
        // int n = 0;
        // for(char c: s.toCharArray()){
        //     if(c >= 'A' && c <= 'Z')
        //         charArr[n++] = (char) (32 + c);
        //     else if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9')
        //         charArr[n++] = c;
        // }
        // int l=0, r=n-1;
        // while(l<r){
        //     if(charArr[l++]!=charArr[r--]) return false;
        // }
        // return true; 
    // }

    // public static int single(int[] arr){
    //     boolean swapped;
    //     for(int i=0;i<arr.length;i++){
    //         swapped = true;
    //         for(int j=1;j<arr.length;j++){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //         if (!swapped) {
    //             break;
    //         }
    //     }
    //     for(int i=0;i<arr.length-1;i+=2){
    //         if (arr[i] != arr[i+1]) {
    //             return arr[i];
    //         }
    //     }
    //     return arr[arr.length-1];
    // }

    // public static String convertToTitle(int columnNumber) {
    //     if(columnNumber>=1 && columnNumber<=26){
    //         char ch = 
    //     }
    // }

    public static int majElem(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        // System.out.println(rtoInt("II"));
        // int[] arr = {1, 1, 2, 2, 4, 5, 3};
        // System.out.println(dup(arr));
        // int value = 2;
        // System.out.println(removeElement(arr, value));
        // System.out.println(needleHaystick("iamsad", "sad"));
        // System.out.println(divide(10, 3));
        // int[] arr = {2,32,4,5,10, 6};
        // System.out.println(Arrays.toString(threeSum(arr, 40)));
        // int[] arr = {1,3,5,6};
        // System.out.println(searchIndex(arr, 5));
        // System.out.println(lengthofLastWord("luffy is still joyboy"));
        // int[] arr = {9};
        // System.out.println(Arrays.toString(plusOne(arr)));
        // System.out.println(sqrt(10));
        // int[] n1 = {1,2,3,0,0,0};
        // int[] n2 = {2,5,6};
        // merge(n1, 3, n2, 3);
        // String s = "A man, a plan, a canal: Panama";
        // System.out.println(isPalin(s));
        // int[] arr = {4,1,2,1,2};
        // System.out.println(single(arr));
        // System.out.println(convertToTitle(5));
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majElem(arr));
    }
}