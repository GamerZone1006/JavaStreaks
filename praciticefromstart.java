import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class praciticefromstart {

    //Permutation of arrays
    // public static int[] buildArray(int[] nums){
    //     int[] ans = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         ans[i] = nums[nums[i]];
    //     }
    //     return ans;
    // }

    //concatenation of arrays
    // public static int[] getConcat(int[] nums){
    //     int[] nums2 = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         nums2[i] = nums[i];
    //     }
    //     int n1 = nums.length;
    //     int n2 = nums2.length;
    //     int[] ans = new int[n1+n2];
    //     System.arraycopy(nums, 0, ans, 0, n1);
    //     System.arraycopy(nums, 0, ans, n1, n2);
    //     return ans;
    // }

    //running sum 
    // public static int[] runningSum(int[] nums){
    //     int sum = 0;
    //     int[] res = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         sum += nums[i];
    //         res[i] = sum;
    //     }
    //     return res;
    // }

    //sabse ameera aadmi
    // public static int maxWealth(int[][] accounts){
    //     int richManMoney = 0;
    //     for(int i=0;i<accounts.length;i++){
    //         int sum = 0;
    //         for(int j=0;j<accounts[i].length;j++){
    //             sum += accounts[i][j];
    //         }
    //         richManMoney = Math.max(richManMoney, sum);
    //     }
    //     return richManMoney;
    // }

    //shuffle array
    // public static int[] shuffle(int[] nums, int n){
    //     // int[] res = new int[2*n];
    //     int[] res = new int[2*n];
    //     for(int i=0;i<n;i++){
    //         res[2*i] = nums[i];
    //         res[2*i+1] = nums[i+n];
    //     }
    //     return res;
    // }

    //spiral matrix

    // public static int[][] spiralnxn(int n){
    //     int[][] martix = new int[n][n];
    //     int num = 1;
    //     int top=0;
    //     int bottom = n-1;
    //     int left = 0;
    //     int right = n-1;
    //     while (num <= n*n) {
    //         for(int i=left;i<=right;i++){
    //             martix[top][i] = num++;
    //         }
    //         top++;
    //         for(int i=top;i<=bottom;i++){
    //             martix[i][right] = num++;
    //         }
    //         right--;
    //         if (top<=bottom) {
    //             for(int i=right;i>=left;i--){
    //                 martix[bottom][i] = num++;
    //             }
    //             bottom--;
    //         }
    //         if (left<=right) {
    //             for(int i=bottom;i>=top;i--){
    //                 martix[i][left] = num++;
    //             }
    //             left++;
    //         }
    //     }
    //     return martix;
    // }

    // public int noofGoodPairs(int[] nums){
    //     HashMap<Integer, Integer>  map = new HashMap<>();
    //     int count = 0;
    //     for(int n : nums){
    //         int c = map.getOrDefault(n, 0);
    //         count += c;
    //         map.put(n, c+1);
    //     }
    //     return count;
    // }

    // public static int[] smallerthanCurrent(int[] nums){
    //     int[] res = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int count = 0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[i]>nums[j]){
    //                 count++;
    //             }
    //         }
    //         res[i] = count;
    //     }
    //     return res;
    // }

    // public static int[] createTargetArray(int[] nums, int[] index) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int[] target = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         list.add(index[i], nums[i]);
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         target[i] = list.get(i);
    //     }
    //     return target;
    // }


    //this works in vs code not leetcode
    // public static void rotate(int[] nums, int k){
    //     int n = nums.length;
    //     k=k%n;
    //     int[] a1 = new int[n-k];
    //     for(int i=0;i<n-k;i++){
    //         a1[i] = nums[i];
    //     }
    //     int[] a2 = new int[k];
    //     for(int i=0;i<k;i++){
    //         a2[i] = nums[n-k+i];
    //     }
    //     int[] res = new int[n];
    //     System.arraycopy(a2,0,res,0,a2.length);
    //     System.arraycopy(a1,0,res,a2.length,a1.length);
    //     System.out.println(Arrays.toString(res));
    // }

    //for leetcode:
    // public static void reverse(int[] nums, int start, int end){
    //     while (start<end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    // public static void rotating(int[] nums, int k){
    //     int n = nums.length;
    //     k = k%n;
    //     reverse(nums, 0, n-1);
    //     reverse(nums, 0, k-1);
    //     reverse(nums, k, n-1);
    // }

    // public static int largestAltitude(int[] gain) {
    //     int max = gain[0];
    //     for(int i=0;i<gain.length;i++){
    //         max = Math.max(max, gain[i]);
    //     }
    //     return max;
    // }

    // public static int count(int n){
    //     int c = 0;
    //     int temp = n;
    //     while (temp>0) {
    //         c += 1;
    //         temp /= 10;
    //     }
    //     return c;
    // }

    // public static int findNo(int[] nums){
    //     int evenNo = 0;
    //     for(int n : nums){
    //         int num = count(n);
    //         if (num%2 == 0) {
    //             evenNo++;
    //         }
    //     }
    //     return evenNo;
    // }

    // public static int[][] rotate(int[][] matrix){
    //     int n = matrix.length;
    //     int[][] rotated = new int[n][n];
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix.length;j++){
    //             rotated[j][n-i-1] = matrix[i][j];
    //         }
    //     }
    //     return rotated;
    // }

    // public static boolean areMaticesEqual(int[][] a, int[][] b){
    //     int n = a.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if (a[i][j] != b[i][j]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // public static boolean findRotation(int[][] matrix, int[][] target){
    //     for(int i=0;i<4;i++){
    //         if (areMaticesEqual(matrix, target)) {
    //             return true;
    //         }
    //         matrix = rotate(matrix);
    //     }
    //     return false;
    // }

    // public static void setZeros(int[][] matrix){
    //     int n = matrix.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if (matrix[i][j] == 0) {
    //                 matrix[i][0] = 0;
    //                 matrix[0][j] = 0;
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if (matrix[i][0] == 0 || matrix[0][j] == 0) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    public static int[] productExceptSelf(int[] nums){
        // int prod = 1;
        // int[] res = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if (nums[i]==nums[j]) {
        //             continue;
        //         }
        //         prod = prod*nums[j];
        //     }
        //     res[i] = prod;
        // }
        // return res;
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {0,2,1,5,3,4};
        // System.out.println(Arrays.toString(buildArray(arr)));
        // int[] arr = {1,2,1};
        // System.out.println(Arrays.toString(getConcat(arr)));
        // int[] arr = {1,2,3,4};
        // System.out.println(Arrays.toString(runningSum(arr)));
        // int[][] arr = {
        //     {1,5},{7,3},{3,5}
        // };
        // System.out.println(maxWealth(arr));
        // int[] arr = {2,5,1,3,4,7};
        // System.out.println(Arrays.toString(shuffle(arr, 3)));

        // System.out.println(Arrays.toString(spiralnxn(3)));
        // int[] arr = {8,1,2,2,3};
        // System.out.println(Arrays.toString(smallerthanCurrent(arr)));

        // int[] nums = {0,1,2,3,4};
        // int[] index = {0,1,2,2,1};
        // System.out.println(Arrays.toString(createTargetArray(nums, index)));

        // int[] arr = {-1,-100,3,99};
        // rotating(arr, 2);
        // System.out.println(Arrays.toString(arr));

        // int[] arr = {-5,1,5,0,-7};
        // System.out.println(largestAltitude(arr));

        // int[] arr = {12,345,2,6,7896};
        // System.out.println(findNo(arr));
        // System.out.println(count(123));

        // int[][] matrix = {
        //     {0,1},
        //     {1,0}
        // };
        // int[][] target = {
        //     {1,0},{0,1}
        // };
        // System.out.println(findRotation(matrix, target));

        // int[][] matrix = {
        //     {1,1,1},{1,0,1},{1,1,1}
        // };
        // System.out.print(setZeros(matrix));
        // setZeros(matrix);
        // System.out.println(Arrays.toString(matrix));

        int[] arr = {1,2,3,4};
        int[] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
}
