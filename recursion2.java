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

    //Sum of digits
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
    public static void revNo(int n){
        if(n<1){
            return;
        }
        System.out.print((n%10));
        revNo(n/10);
    }
    public static void main(String[] args) {
        // fun(5);
        // System.out.println(factorial(5));
        // System.out.println(sumOfnNos(5));
        // System.out.println(sumOfDigits(1546));
        // System.out.println(product(1234));
        // System.out.println(product(505));
        revNo(1234);
    }
}
