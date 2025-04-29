import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter year: ");
        // int n = sc.nextInt();
        // if(n%4 == 0){
        //     System.out.println("Leap Year");
        // }
        // else{
        //     System.out.println("Not a leap year.");
        // }

        // System.out.println("Enter first number= ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter 2nd number = ");
        // int n2 = sc.nextInt();
        // int s = (n1+ n2);
        // System.out.println("Sum is "+s);

        // System.out.println("Enter a number = ");
        // int n = sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+" x "+i+" = "+(n*i));
        // }

        // System.out.println("Enter number until x: ");
        // int sum = 0;
        // while (true) {
        //     String input = sc.next();
        //     if (input.equals("x")) {
        //         break;
        //     }
        //     int n = Integer.parseInt(input);
        //     sum += n;
        // }
        // System.out.println("Sum of all numbers is "+sum);

        // System.out.print("Enter a number = ");
        // int n = sc.nextInt();
        // if (n%2 == 0) {
        //     System.out.println("Even number.");
        // }
        // else{
        //     System.out.println("Odd number.");
        // }

        // System.out.print("Enter name: ");
        // String n = sc.next();
        // System.out.println("Hello "+n);

        // System.out.println("Enter principal value= ");
        // int p = sc.nextInt();
        // System.out.println("Enter time = ");
        // int t = sc.nextInt();
        // System.out.println("Enter rate of interest = ");
        // int r = sc.nextInt();
        // int si = (p*t*r)/100;
        // System.out.println("Simple Interest = "+si);

        // System.out.println("Enter choice (1-Add, 2-Subtract, 3-Multiply, 4-Divide):");
        // int n = sc.nextInt();
        // System.out.println("Enter first number = ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter 2nd number = ");
        // int n2 = sc.nextInt();
        // switch (n) {
        //     case 1:
        //         System.out.println("Sum is "+(n1+n2));
        //         break;
        //     case 2:
        //         System.out.println("Difference is "+(n1-n2));
        //         break;
        //     case 3:
        //         System.out.println("Multiplication is "+(n1*n2));
        //         break;
        //     case 4:
        //         if (n2==0) {
        //             System.out.println("Invalid!");
        //         }
        //         else{
        //             System.out.println("Division is "+(n1/n2));
        //         }
        //     default:
        //         break;
        // }

        // System.out.println("Enter first number = ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter second number = ");
        // int n2 = sc.nextInt();
        // System.out.println("Largest number is "+(n1 > n2 ? n1 : n2));

        // System.out.println("Enter amount in rupees = ");
        // double money = sc.nextDouble();
        // double usd = money * 0.012;
        // System.out.println("Amouont in USD is "+usd);

        // int n1 =0, n2 = 1;
        // System.out.print("Enter last count = ");
        // int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int n3 = n1+n2;
        //     System.out.print(" "+n3);
        //     n1 = n2;
        //     n2 = n3;
        // }

        // System.out.println("Enter a string: ");
        // String s = sc.nextLine();
        // int start = 0;
        // int end = s.length()-1;
        // boolean isPalin = true;
        // while (start<end) {
        //     if (s.charAt(start) != s.charAt(end)) {
        //         isPalin = false;
        //         break;
        //     }
        //     start++;
        //     end--;
        // }
        // if (isPalin) {
        //     System.out.println("String is palindrome.");
        // }
        // else{
        //     System.out.println("String is not palindrome.");
        // }

        // System.out.println("Enter number = ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int og = n;
        // while (n!=0) {
        //     int digit = n%10;
        //     sum += digit*digit*digit;
        //     n /= 10;
        // }
        // if (sum == og) {
        //     System.out.println("Number is armstrong");
        // }
        // else{
        //     System.out.println("Number is not armstrong.");
        // }


        // System.out.print("Enter radius of circle = ");
        // double r = sc.nextInt();
        // double a = Math.PI * r*r;
        // System.out.println("Area is "+ String.format("%.2f",a));

        // System.out.print("Enter a number = ");
        // int n = sc.nextInt();
        // if (n<10) {
        //     System.out.println("Enter a number greater than 9");
        // }
        // else{
        //     int product = 1;
        //     int sum = 0;
        //     int temp = n;
        //     while (temp > 0) {
        //         int digit = n%10;
        //         sum += digit;
        //         product *= digit;
        //         temp /= 10;
        //     }
        //     System.out.println(product - sum);
        // }

        // System.out.println("Enter a number whose factors u wanna print = ");
        // int n = sc.nextInt();
        // System.out.println("Factors of "+n+" are:");
        // for(int i =1; i<=n;i++){
        //     if (n%i == 0) {
        //         System.out.println(i);
        //     }
        // }

        // System.out.println("Enter digits upto 0: ");
        // int sum = 0;
        // int n = sc.nextInt();
        // while (n != 0) {
        //     sum += n;
        //     n = sc.nextInt();
        // }
        // System.out.println("Sum is "+sum);

        // System.out.println("Enter numbers upto 0: ");
        // int n = sc.nextInt();
        // int max = n;
        // while (n != 0) {
        //     n = sc.nextInt();
        //     max = Math.max(n, max);
        // }
        // System.out.println("Max number is "+max);

        sc.close();
    }
}

