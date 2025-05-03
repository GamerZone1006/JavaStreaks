import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class day7 {
    // public static ArrayList<Integer> indexmatch(int[] nums, int[] index){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         res.add(index[i],nums[i]);
    //     }
    //     return res;
    // }

    // public static boolean isPangram(String s){
    //     HashSet<Character> letters = new HashSet<>();
    //     for(char c : s.toCharArray()){
    //         if (c >= 'a' && c<= 'z') {
    //             letters.add(c);
    //         }
    //     }
    //     return letters.size() == 26;
    // }

    // public static int matches(List<List<String>> items, String rulekey, String rulevalue){
    //     int index = 0;
    //     if (rulekey.equals("color")) {
    //         index = 1;
    //     }
    //     else if (rulekey.equals("name")) {
    //         index = 1;
    //     }
    //     int count = 0;
    //     for(List<String> item : items){
    //         if (item.get(index).equals(rulevalue)) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static int highestAlt(int[] gain){
    //     int start = 0;
    //     int max = 0;
    //     for(int i=0;i<gain.length;i++){
    //         start += gain[i];
    //         if (start>max) {
    //             max = start;
    //         }
    //     }
    //     return max;
    // }

    // public static int[] permutation(int[] arr){
    //     int[] res = new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         res[i] = arr[arr[i]];
    //     }
    //     return res;
    // }

    // public static int[] doubleArray(int[] arr){
    //     int n1 = arr.length;
    //     int[] arr2 = new int[n1];
    //     int n2 = arr2.length;
    //     int[] res = new int[n1 + n2];
    //     for(int i=0;i<n1;i++){
    //         arr2[i] = arr[i];
    //     }
    //     System.arraycopy(arr, 0, arr, 0, n1);
    //     System.arraycopy(arr2, 0, res, n1, n2);
    //     return res;
    // }

    public static int[] running(int[] arr){
        int sum = 0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] nums = {0,1,2,3,4};
        // int[] index = {0,1,2,2,1};
        // System.out.println(indexmatch(nums, index));

        // String s = "thequickbrownfoxjumpsoverthelazydog";
        // System.out.println(isPangram(s));

        // List<List<String>> items = List.of(
        //     List.of("phone", "blue", "pixel"),
        //     List.of("computer", "silver", "lenovo"),
        //     List.of("phone", "gold", "iphone")
        // );
        // String ruleKey = "color";
        // String ruleValue = "silver";
        // System.out.println("Matches: " + matches(items, ruleKey, ruleValue));

        int[] arr = {1,2,3,4};
        int[] res = running(arr);
        System.out.println(Arrays.toString(res));
    }
}
