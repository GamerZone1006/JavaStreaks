import java.util.Arrays;

public class mergesort {

    public static int[] ms(int[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = ms(Arrays.copyOfRange(arr, 0, mid));
        int[] right = ms(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] last){
        int[] mix = new int[first.length + last.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<last.length) {
            if (first[i]<last[j]) {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = last[j];
                j++;
            }
            k++;
        }
        while (i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<last.length) {
            mix[k] = last[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        ms(arr);
        System.out.println(Arrays.toString(arr));
    }
}
