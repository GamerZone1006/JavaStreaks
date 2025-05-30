import java.util.ArrayList;
import java.util.Arrays;

public class cyclicsort {

    // public static void cs(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correctInd = arr[i]-1;
    //         if (arr[i] != arr[correctInd]) {
    //             int temp = arr[i];
    //             arr[i] = arr[correctInd];
    //             arr[correctInd] = temp;
    //         }
    //         else{i++;}
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    //Missing nubmer
    // public static ArrayList<Integer> missingNos(int[] arr){
    //     int i=0;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (i<arr.length) {
    //         int correct = arr[i];
    //         if(arr[i]>=0 && arr[i]<arr.length && arr[i] != arr[correct]){
    //             int temp = arr[i];
    //             arr[i] = arr[correct];
    //             arr[correct] = temp;
    //         }
    //         else{i++;}
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         if (j != arr[j]) {
    //             res.add(j);
    //         }
    //     }
    //     return res;
    // }

    //disapperared numbers
    // public static void disapperared(int[] arr){
    //     int i=0;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (i<arr.length) {
    //         int correct = arr[i] - 1;
    //         if (arr[i] != arr[correct] && arr[i]>0 && arr[i]<=arr.length) {
    //             int temp = arr[i];
    //             arr[i] = arr[correct];
    //             arr[correct] = temp;
    //         }
    //         else{i++;}
    //     }
    //     for(int j = 0;j<arr.length;j++){
    //         if (arr[j] != j+1) {
    //             res.add(j);
    //         }
    //     }
    //     System.out.println(res);
    // }

    //Duplicate
    // public static void duplicate(int[] arr){
    //     int i=0;
    //     while(i<arr.length){
    //         int correct = arr[i] - 1;
    //         if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]){
    //             int temp = arr[i];
    //             arr[i] = arr[correct];
    //             arr[correct] = temp;
    //         }
    //         else{i++;}
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         if (arr[j] != j+1) {
    //             System.out.print(arr[j]+" ");
    //         }
    //     }
    // }

    //finding duplicate and the missing number
    // public static void duplicateNmissing(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correct = arr[i] - 1;
    //         if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
    //             int temp = arr[i];
    //             arr[i] = arr[correct];
    //             arr[correct] = temp;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int j=0;j<arr.length;j++){
    //         if (arr[j] != j+1) {
    //             res.add(arr[j]);
    //             res.add(j+1);
    //         }
    //     }
    //     System.out.println(res);
    // }

    public static int firstMissingPositive(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{i++;}
        }
        for(int j=0;j<arr.length;j++){
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }

    public static void main(String[] args) {
        // int[] arr = {3,2,4,5,1};
        // cs(arr);
        // int[] arr = {1,0,3};
        // ArrayList<Integer> res = missingNos(arr);
        // System.out.println(res);
        // int[] arr = {4,3,2,7,8,2,3,1};
        // disapperared(arr);
        // int[] arr = {3, 1, 3, 4, 2, 2, 5, 5};
        // duplicate(arr);
        // int[] arr = {1,2,2,4};
        // int[] arr = {1,1};
        // duplicateNmissing(arr);
        // int[] arr = {3,4,-1,1};
        // int[] arr = {1,2,0};
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
}
