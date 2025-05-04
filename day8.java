public class day8 {
    public static int linearSearch(int[] arr, int target){
        int elem = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target) {
                elem = i;
            }
        }
        return elem;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 7;
        System.out.println(target+" is at position "+linearSearch(arr, target));
    }
}