public class recursion2 {

    // public static void fun(int n){
    //     if (n==0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     fun(n-1);
    //     System.out.println(n);
    // }

    //factorial using recursion
    // public static int factorial(int n){
    //     if (n<=1) {
    //         return 1;
    //     }
    //     return n*factorial(n-1);
    // }

    //sum of n numbers
    // public static int sumOfnNos(int n){
    //     if (n<=1) {
    //         return n;
    //     }
    //     return n + sumOfnNos(n-1);
    // }

    // Sum of digits
    // public static int sumOfDigits(int n){
    //     if (n==0) {
    //         return 0;
    //     }
    //     return (n%10) + sumOfDigits(n/10);
    // }

    // product of digits
    // public static int product(int n){
    //     if (n<=1) {
    //         return 1;
    //     }
    //     return n%10 * product(n/10);
    // }

    //Reverse a number using recursion
    // public static void revNo(int n){
    //     if(n<1){
    //         return;
    //     }
    //     System.out.print((n%10));
    //     revNo(n/10);
    // }

    // public static int reverse(int n,  int rev){
    //     if (n==0) {
    //         return rev;
    //     }
    //     return reverse(n/10, rev*10 + n%10);
    // }

    //reverse and multiply by 10^i
    // public static void revNMul(int n){
    //     int i = (int)(Math.log10(n)) + 1;
    //     if (n<1) {
    //         return;
    //     }
    //     System.out.println((n%10)*10*Math.pow(n, i));
    // }

    // public static int rev(int n, int rev){
    //     if (n==0) {
    //         return rev;
    //     }
    //     return rev(n/10,rev*10+n%10);
    // }

    // public static boolean isPalin(int n){
    //     return n == rev(n, 0);
    // }

    // counting number of 0s
    // public static int zeros(int n, int count){
    //     if (n==0) {
    //         return count;
    //     }
    //     int rem = n%10;
    //     if (rem == 0) {
    //         return zeros(n/10, count+1);
    //     }
    //     return zeros(n/10, count);
    // }

    //no of steps to make a number 0
    // public static int steps(int n, int count){
    //     if (n==0) {
    //         return count;
    //     }
    //     if (n%2==0) {
    //         return steps(n/2, count+1);
    //     }
    //     return steps(n-1, count+1);
    // }

    public static void rev(int n){
        if(n==0) return;
        System.out.print(n%10);
        rev(n/10);
    }

    public static void main(String[] args) {
        // fun(5);
        // System.out.println(factorial(5));
        // System.out.println(sumOfnNos(5));
        // System.out.println(sumOfDigits(1546));
        // System.out.println(product(1234));
        // System.out.println(product(505));
        // revNo(1234);
        // System.out.println(isPalin(12321));
        // System.out.println(zeros(302040,0));
        // System.out.println(reverse(12345, 0));
        // System.out.println(steps(14, 0));
        rev(12345);
    }
}
