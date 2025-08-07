import java.util.ArrayList;
import java.util.List;

public class recursion1 {
    // function that takes a numbera and prints it
    // public static void takeNoNprint(){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number= ");
    // int n = sc.nextInt();
    // System.out.println(n);
    // sc.close();
    // }

    // static void firstFiveNos(){
    // for(int i=1;i<6;i++){
    // System.out.println(i);
    // }
    // }

    // Binary search using recursion
    // public static int bs(int[] arr, int target, int s, int e){
    // int m = (e-s)/2 + s;
    // if (s>e) {
    // return -1;
    // }
    // if (arr[m] == target) {
    // return m;
    // }
    // else if(arr[m]>target){
    // return bs(arr, target, s, m-1);
    // }
    // return bs(arr, target, m+1, e);
    // }

    // Fibonacci using recursion
    // public static int fibo(int n){
    // if(n<2) return n;
    // return fibo(n-1) + fibo(n-2);
    // }

    // Returning element that appears only once in an array
    // public static int once(int[] arr) {
    //     int unique = 0;
    //     for(int n : arr){
    //         unique ^= n;
    //     }
    //     return unique;
    // }

    //finding the ith bit
    // public static int ithbit(int n, int i){
    //     return(n&(1<<i)) != 0 ? 0:1;
    // }

    //finding nth magical number
    // public static int magicalNo(){
    //     int n=6;
    //     while(n>0){
    //         int last = n
    //     }
    // }

    //factorial of a number
    // public static int fact(int n){
    //     if(n<1) return 1;
    //     return n*fact(n-1);
    // }

    //sum of digits in a number
    // public static int sumOfDigits(int n){
    //     if(n == 0) return 1;
    //     return (n%10) * sumOfDigits(n/10);
    // }

    //reverse a number
    // public static int rev(int n, int rev){
    //     if(n==0) return rev;
    //     return rev(n/10, rev*10+n%10);
    // }

    // public static void skip(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     if(ch == 'a'){
    //         skip(p, up.substring(1));
    //     }
    //     else{
    //         skip(p+ch, up.substring(1));
    //     }
    // }

    //subsets
    // public static ArrayList<String> subsets(String p, String up){
    //     ArrayList<String> list = new ArrayList<>();
    //     if(up.isEmpty()){
    //         list.add(p);
    //         return list;
    //     }
    //     char ch = up.charAt(0);
    //     list.addAll(subsets(p+ch, up.substring(1)));
    //     list.addAll(subsets(p, up.substring(1)));
    //     list.addAll(subsets(p+(ch+0), up.substring(1)));
    //     return list;
    // }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()) return list;
        list.addAll(keypad("", digits));
        return list;
    }
    public static void keypad(String p, String up){
        String[] map = {
            "", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        StringBuffer list = new StringBuffer();
        if(up.isEmpty()){
            list.append(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        String letters = map[digit];
        for(char ch : letters.toCharArray()){
            list.append(keypad(p+ch, up.substring(1)));
        }
    }

    public static void main(String[] args) {
        // takeNoNprint();
        // firstFiveNos();
        // int[] arr = {2,6, 8, 10, 12, 13, 15, 20, 23};
        // System.out.println(bs(arr, 13, 0, arr.length-1));
        // System.out.println(fibo(3));
        // int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 };
        // int[] arr = {-1, 1, 2, -2, 3, 4, -4};
        // System.out.println(once(arr));
        // int n = 1010110;
        // int i = 3;
        // System.out.println(ithbit(n, i));
        // System.out.println(fact(2));
        // System.out.println(sumOfDigits(1342));
        // ArrayList<String> list = subsets("", "abbbc");
        // System.out.println(list);
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }
}
