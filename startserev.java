
import java.util.ArrayList;

public class startserev{
    // public static void days(int n){
    //     switch (n) {
    //         case 1 -> System.out.println("Monday");
    //         case 2 -> System.out.println("Tuesday");
    //         case 3 -> System.out.println("Wednesday");
    //         case 4 -> System.out.println("Thursday");
    //         case 5 -> System.out.println("Friday");
    //         case 6 -> System.out.println("Saturday");
    //         case 7 -> System.out.println("Sunday");
    //         default -> {
    //             System.out.println("Invalid");
    //         }
    //     }
    // }

    // public static int subtractProdSum(int n){
    //     return prod(n)-sum(n);
    // }

    // public static int sum(int dig){
    //     if(dig==0) return 0;
    //     return ((dig%10)+sum(dig/10));
    // }

    // public static int prod(int dig){
    //     if(dig==0) return 1;
    //     return ((dig%10)*prod(dig/10));
    // }

    // public static int[] concat(int[] nums){
    //     int[] nums2 = new int[nums.length];
    //     for(int i=0; i<nums.length;i++){
    //         nums2[i] = nums[i];
    //     }
    //     int[] ans = new int[nums.length + nums2.length];
    //     System.arraycopy(nums, 0, ans, 0, nums.length);
    //     System.arraycopy(nums2, 0, ans, nums.length, nums2.length);
    //     return ans;
    // }

    //count digits
    // public static int count(int n){
    //     if(n==0) return 0;
    //     return 1 + count(n/10);
    // }

    //reverse a number
    // public static int rev(int n, int rev){
    //     if(n==0) return rev;
    //     return rev(n/10, (rev*10 + n%10));
    // }

    // public static boolean isPalin(int n){
    //     return n == rev(n, 0);
    // }

    //gcd
    // public static int gcd(int n1, int n2){
    //     int gcd = 1;
    //     for(int i=1;i<Math.min(n1, n2); i++){
    //         if(n1 % i==0 && n2 % i == 0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    // public static boolean isArms(int n){
    //     int sum = 0;
    //     int dig = 0;
    //     int cp = n;
    //     while(n != 0){
    //         dig = n%10;
    //         sum += dig*dig*dig;
    //         n /= 10;
    //     }
    //     return cp == sum;
    // }

    // public static int cubicSum(int n){
    //     int sum = 0;
    //     if(n==0) return sum;
    //     int digit = n%10;
    //     sum += digit*digit*digit + cubicSum(n/10);
    //     return sum;
    // }

    // public static boolean isArms(int n){
    //     return n == cubicSum(n);
    // }

    public static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n ;i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter marks = ");
        // int n = sc.nextInt();
        // if(n>=90) System.out.println("Grade A");
        // else if(n>=70) System.out.println("Grade B");
        // else if(n>=50) System.out.println("Grade C");
        // else if(n>=35) System.out.println("Grade D");
        // else System.out.println("Fail");
        // System.out.print("Enter a day in week: ");
        // int n = sc.nextInt();
        // days(n);
        // System.out.println(sum(234));
        // System.out.println(prod(234));
        // System.out.println(subtractProdSum(234));
        // System.out.println(count(234));
        // System.out.println(rev(234, 0));
        // System.out.println(isPalin(123431));
        // System.out.println(gcd(15, 20));
        // System.out.println(isArms(153));
        ArrayList<Integer> list = new ArrayList<>();
        list = divisors(36);
        System.out.println(list);
        // sc.close();
    }
}