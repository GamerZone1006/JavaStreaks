public class day6 {
    public static int identical(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if (arr[i] == arr[j]) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println("Identical pairs: "+identical(arr));
    }
}
