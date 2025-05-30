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
    public static int sumOfnNos(int n){
        if (n<=1) {
            return n;
        }
        return n + sumOfnNos(n-1);
    }
    public static void main(String[] args) {
        // fun(5);
        // System.out.println(factorial(5));
        System.out.println(sumOfnNos(5));
    }
}
