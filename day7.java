import java.util.ArrayList;

public class day7 {
    public static ArrayList<Integer> indexmatch(int[] nums, int[] index){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(index[i],nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(indexmatch(nums, index));
    }
}
