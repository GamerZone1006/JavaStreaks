import java.util.Arrays;

public class day10 {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length - i;j++){
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
