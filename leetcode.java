public class leetcode {

    //roman to integer
    // public static int getValue(char ch){
    //     switch (ch) {
    //         case 'I':
    //             return 1;
    //         case 'V':
    //             return 5;
    //         case 'X':
    //             return 10;
    //         case 'L':
    //             return 50;
    //         case 'C':
    //             return 100;
    //         case 'D':
    //             return 500;
    //         case 'M':
    //             return 1000;
    //         default:
    //             return 0;
    //     }
    // }
    // public static int rtoInt(String s){
    //     int res = 0;
    //     int pre = 0;
    //     for(int i=s.length()-1;i>=0;i--){
    //         int rom = getValue(s.charAt(i));
    //         if (rom<pre) {
    //             res -= rom;
    //         }
    //         else{
    //             res += rom;
    //         }
    //         pre = rom;
    //     }
    //     return res;
    // }

    //remove count duplicates
    
    // public static int dup(int[] arr){
    //     if (arr.length == 0) {
    //         return 0;
    //     }
    //     int i=0;
    //     for(int j=1;j<arr.length;j++){
    //         if (arr[j] != arr[i]) {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }
    //     return i+1;
    // }

    public static int removeElement(int[] arr, int value){
        int i=0;
        int n=arr.length;
        while (i<n) {
            if (arr[i] == value) {
                arr[i] = arr[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // System.out.println(rtoInt("II"));
        int[] arr = {1, 1, 2, 2, 4, 5, 3};
        // System.out.println(dup(arr));
        int value = 2;
        System.out.println(removeElement(arr, value));
    }
}
