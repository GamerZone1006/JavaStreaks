
import java.util.ArrayList;

// 1. 1 to n
// 2. n to 1
// 3. fact
// 4. sum of n num
// 5. reverse a num
// 6. palindrome
// 7. linear search
// 8. print permutation of string, sirf print
// 9. permutation of strings ko list which is in arg usme store
// 10. permutation of string, return type arraylist
// 11. subset prob

// this will revise basic recursion

// after this,
// 1. total paths vala direction vala, without obstacle
// 2. with obstacle
// 3. backtracking vala video, n queen, n knight, sudoku

public class recursionrev {

    // public static void q1(int n){
    //     if(n<1){
    //         return;
    //     }
    //     q1(n-1);
    //     System.out.println(n);
    // }

    // public static void q2(int n){
    //     if(n<1){
    //         return;
    //     }
    //     System.out.println(n);
    //     q2(n-1);
    // }

    // public static int factq3(int n){
    //     if(n<2){
    //         return 1;
    //     }
    //     return n*factq3(n-1);
    // }

    // public static int q4(int n){
    //     if(n<1){
    //         return n;
    //     }
    //     return n+q4(n-1);
    // }.

    // public static int rev(int n, int rev){
    //     if(n==0){
    //         return rev;
    //     }
    //     return rev(n/10, rev*10+(n%10));
    // }

    // public static boolean isPalin(int n){
    //     return n == rev(n, 0);
    // }

    // public static int linearSearch(int target, int[] arr, int n){
    //     if(n==arr.length){
    //         return (Integer) null;
    //     }
    //     if(arr[n] == target){
    //         return n;
    //     }
    //     return linearSearch(target, arr, n+1);
    // }

    // public static void permutation(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     for(int i=0;i<=p.length();i++){
    //         String f = p.substring(0, i);
    //         String s = p.substring(i, p.length());
    //         permutation((f+ch+s), up.substring(1));
    //     }
    // }

    public static ArrayList<String> permutation(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutation((f+ch+s), up.substring(1)));
        }
        return list;
    }

    public static void main(String[] args) {
        // q1(5);
        // q2(5);
        // System.out.println(factq3(5));
        // System.out.println(q4(5));
        // System.out.println(rev(12345, 0));
        // System.out.println(isPalin(12345431));
        // int[] arr = {1,2,3,4,5};
        // System.out.println(linearSearch(2, arr, 0));
        System.out.println(permutation("", "abc"));
    }
}
