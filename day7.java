import java.util.ArrayList;
import java.util.HashSet;

public class day7 {
    // public static ArrayList<Integer> indexmatch(int[] nums, int[] index){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         res.add(index[i],nums[i]);
    //     }
    //     return res;
    // }

    public static boolean isPangram(String s){
        HashSet<Character> letters = new HashSet<>();
        for(char c : s.toCharArray()){
            if (c >= 'a' && c<= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        // int[] nums = {0,1,2,3,4};
        // int[] index = {0,1,2,2,1};
        // System.out.println(indexmatch(nums, index));

        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(s));
    }
}
