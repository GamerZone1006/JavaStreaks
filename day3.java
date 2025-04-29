import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter last number = ");
        // int n = sc.nextInt();
        // int sn = n*(n+1)/2;
        // System.out.println("Sum of first "+n+" numbers is "+sn);

        // System.out.print("Enter last number = ");
        // int num = sc.nextInt();
        // int sum = 0;
        // for(int i = 1;i<=num;i++){
        //     sum += i;
        // }
        // System.out.println("Sum of first "+n+" numbers is "+sum);

        // System.out.print("Enter a number = ");
        // int n = sc.nextInt();
        // int temp = n;
        // int sum = 0;
        // while (temp != 0) {
        //     int digit = temp % 10;
        //     sum += digit * digit * digit;
        //     temp /= 10;
        // }
        // if (sum == n) {
        //     System.out.println("Armstrong number.");
        // }
        // else{
        //     System.out.println("Not armstrong number.");
        // }

        // System.out.println("Enter a number = ");
        // int n = sc.nextInt();
        // int rev = 0;
        // int temp = n;
        // while (temp != 0) {
        //     int digit = temp%10;
        //     rev = rev*10 + digit;
        //     temp /= 10;
        // }
        // if (rev == n) {
        //     System.out.println("Palindrome.");
        // }
        // else{
        //     System.out.println("Not palindrome.");
        // }

        // System.out.println("Enter a string: ");
        // String s = sc.nextLine();
        // int start = 0;
        // int end = s.length() - 1;
        // String rev = "";
        // for(int i=end;i>= start;i--){
        //     rev += s.charAt(i);
        // }
        // System.out.println("Reversed string: "+rev);

        
        // System.out.println("Enter value of n = ");
        // int n = sc.nextInt();
        // System.out.println("Enter value of r = ");
        // int r = sc.nextInt();
        // int npr = factorial(n)/factorial(n-r);
        // System.out.println(n+"P"+r+" = "+npr);
        // int ncr = factorial(n) / (factorial(r) * factorial(n-r));
        // System.out.println(n+"C"+r+" = "+ncr);

        // Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        // int nod = 31;
        // int out = 0;
        // for(int i=1;i<=nod;i++){
        //     if (i%2==0) {
        //         out += 1;
        //     }
        //     else{
        //         out += 0;
        //     }
        // }
        // System.out.println("Out of "+nod+" days in August, Kunal can go out on "+out+" days.");

        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        // System.out.print("Enter numbers until 0: ");
        // int n = sc.nextInt();
        // int son = 0;
        // int soep = 0;
        // int soop = 0;
        // while (n != 0) {
        //     if (n<0) {
        //         son += n;
        //     }
        //     else if (n%2 == 0) {
        //         soep += n;
        //     }
        //     else {
        //         soop += n;
        //     }
        //     n = sc.nextInt();
        // }
        // System.out.println("Sum of negative numbers: "+son);
        // System.out.println("Sum of even positives is "+soep);
        // System.out.println("Sum of odd positives is "+soop);

        // System.out.print("Enter a number = ");
        // int n = sc.nextInt();
        // int temp = n;
        // int sum = 0;
        // while (temp != 0) {
        //     int digit = temp%10;
        //     sum += digit;
        //     temp /= 10;
        // }
        // System.out.println("Sum of digits is "+sum);

        // System.out.print("Enter three numbers = ");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // int max = n1;
        // if (n2 > max) {
        //     max = n2;
        // }
        // else if (n3>max) {
        //     max = n3;
        // }
        // System.out.println("Max number is "+max);

    //     System.out.print("Enter radius of circle: ");
    //     double r = sc.nextDouble();
    //     System.out.println("Area: "+area(r)+ " Circumference: "+circum(r));

        // System.out.println("Enter a number = ");
        // int n = sc.nextInt();
        // if (isPalin(n)) {
        //     System.out.println("Palindrome.");
        // }
        // else{
        //     System.out.println("Not palindrome.");
        // }     

        // System.out.print("Enter values of a, b, c: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if (pytha(a, b, c)) {
        //     System.out.println("Pythagoras theorem applied.");
        // }
        // else{
        //     System.out.println("Pythagores theorem not applied.");
        // }

        // int[] arr = {1,0,3,2,4};
        // int n = arr.length;
        // int[] ans = new int[n];
        // for(int i=0;i<n;i++){
        //     ans[i] = arr[arr[i]];
        //     System.out.println(ans[i]);
        // }

        // int[] a = {1,2,3,4};
        // int sum = 0;
        // for(int i=0;i<a.length;i++){
        //     sum += a[i];
        // }
        // System.out.println("Sum is "+sum);

        
        sc.close();
    }
    // public static boolean pytha(int a, int b, int c){
    //     if (c*c == a*a + b*b) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // public static boolean isPalin(int n){
    //     int rev = 0;
    //     int temp = n;
    //     while (temp != 0) {
    //         int digit = temp%10;
    //         rev = rev*10 + digit;
    //         temp /= 10;
    //     }
    //     if (rev ==n ) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // public static double area(double r){
    //     double area = Math.PI *r*r;
    //     return area;
    // }
    // public static double circum(double r){
    //     double circum = 2 * Math.PI * r;
    //     return circum;
    // }

    // public static int factorial(int num){
    //     int fact = 1;
    //     for(int i = num;i>=1;i--){
    //         fact *= i;
    //     }
    //     return fact;
    // }
}
