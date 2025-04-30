// import java.util.Arrays;
public class day5 {
    // public static int richman(int arr[][]){
    // int maxmoney = 0;
    // for(int i=0;i<arr.length;i++){
    // int sum = 0;
    // for(int j=0;j<arr[i].length;j++){
    // sum += arr[i][j];
    // }
    // maxmoney = Math.max(maxmoney, sum);
    // }
    // return maxmoney;
    // }

    public static int[] shufflearray(int[] arr, int n) {
        int[] result = new int[arr.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = arr[i];
            result[2 * i + 1] = arr[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        // int[][] arr = {
        // {1,2,3},
        // {4,5,6}
        // };
        // System.out.println("Richest person has "+richman(arr));

        int arr[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int res[] = shufflearray(arr, n);
        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
