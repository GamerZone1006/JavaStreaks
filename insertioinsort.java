import java.util.Arrays;

public class insertioinsort {

    // public static void is(int[] arr){
    //     for(int i=0;i<arr.length - 1;i++){
    //         for(int j=i+1;j>0;j--){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    //Sorting in ascending order
    // public static void is(int[] arr){
    //     for(int i=0;i<arr.length - 1;i++){
    //         for(int j=i+1;j>0;j--){
    //             if (arr[j] < arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    //sorting in desc order
    // public static void is(int[] arr){
    //     for(int i=0;i<arr.length - 1;i++){
    //         for(int j=i+1;j>0;j--){
    //             if (arr[j]>arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    //counting the nubmer of swaps
    // public static int isswaps(int[] arr){
    //     int count = 0;
    //     for(int i=0;i<arr.length - 1;i++){
    //         for(int j=i+1;j>0;j--){
    //             if (arr[j]<arr[j-1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 count += 1;
    //             }
    //             else{break;}
    //         }
    //     }
    //     return count;
    // }

    //Sorting string's array
    public static void isStrings(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j].length() < arr[j-1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{break;}
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // int[] arr = {5, 2, 9, 1, 5, 6};
        // is(arr);
        // System.out.println(isswaps(arr));
        String[] arr = {"apple", "pie", "banana", "kiwi"};
        isStrings(arr);
    }
}
