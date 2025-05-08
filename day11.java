import java.util.ArrayList;
import java.util.List;

public class day11 {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static List<Integer> missing(int[] arr){
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i<arr.length) {
            int correctInd = arr[i] - 1;
            if (arr[i]>arr.length && arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if (arr[j] != j+1) {
                res.add(j+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
