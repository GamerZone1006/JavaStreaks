import java.util.Arrays;
import java.util.Scanner;
public class day4 {
    // public static boolean age(int age){
    //     if(age<18){
    //         return false;
    //     }
    //     else if (age>=18) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    public static int[] concat(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1+n2];
        System.arraycopy(arr1, 0, result, 0, n1);
        System.arraycopy(arr2, 0, result, n1, n2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter age: ");
        // int a = sc.nextInt();
        // if (age(a)) {
        //     System.out.println("Eligible");
        // }
        // else{
        //     System.out.println("Not eligible.");
        // }

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] result = concat(arr1, arr2);
        System.out.println("Concatenated string: "+Arrays.toString(result));
        sc.close();   
    }
}
