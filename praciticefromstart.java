import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class praciticefromstart {

    // Permutation of arrays
    // public static int[] buildArray(int[] nums){
    // int[] ans = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // ans[i] = nums[nums[i]];
    // }
    // return ans;
    // }

    // concatenation of arrays
    // public static int[] getConcat(int[] nums){
    // int[] nums2 = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // nums2[i] = nums[i];
    // }
    // int n1 = nums.length;
    // int n2 = nums2.length;
    // int[] ans = new int[n1+n2];
    // System.arraycopy(nums, 0, ans, 0, n1);
    // System.arraycopy(nums, 0, ans, n1, n2);
    // return ans;
    // }

    // running sum
    // public static int[] runningSum(int[] nums){
    // int sum = 0;
    // int[] res = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // sum += nums[i];
    // res[i] = sum;
    // }
    // return res;
    // }

    // sabse ameera aadmi
    // public static int maxWealth(int[][] accounts){
    // int richManMoney = 0;
    // for(int i=0;i<accounts.length;i++){
    // int sum = 0;
    // for(int j=0;j<accounts[i].length;j++){
    // sum += accounts[i][j];
    // }
    // richManMoney = Math.max(richManMoney, sum);
    // }
    // return richManMoney;
    // }

    // shuffle array
    // public static int[] shuffle(int[] nums, int n){
    // // int[] res = new int[2*n];
    // int[] res = new int[2*n];
    // for(int i=0;i<n;i++){
    // res[2*i] = nums[i];
    // res[2*i+1] = nums[i+n];
    // }
    // return res;
    // }

    // spiral matrix

    // public static int[][] spiralnxn(int n){
    // int[][] martix = new int[n][n];
    // int num = 1;
    // int top=0;
    // int bottom = n-1;
    // int left = 0;
    // int right = n-1;
    // while (num <= n*n) {
    // for(int i=left;i<=right;i++){
    // martix[top][i] = num++;
    // }
    // top++;
    // for(int i=top;i<=bottom;i++){
    // martix[i][right] = num++;
    // }
    // right--;
    // if (top<=bottom) {
    // for(int i=right;i>=left;i--){
    // martix[bottom][i] = num++;
    // }
    // bottom--;
    // }
    // if (left<=right) {
    // for(int i=bottom;i>=top;i--){
    // martix[i][left] = num++;
    // }
    // left++;
    // }
    // }
    // return martix;
    // }

    // public int noofGoodPairs(int[] nums){
    // HashMap<Integer, Integer> map = new HashMap<>();
    // int count = 0;
    // for(int n : nums){
    // int c = map.getOrDefault(n, 0);
    // count += c;
    // map.put(n, c+1);
    // }
    // return count;
    // }

    // public static int[] smallerthanCurrent(int[] nums){
    // int[] res = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // int count = 0;
    // for(int j=0;j<nums.length;j++){
    // if(nums[i]>nums[j]){
    // count++;
    // }
    // }
    // res[i] = count;
    // }
    // return res;
    // }

    // public static int[] createTargetArray(int[] nums, int[] index) {
    // ArrayList<Integer> list = new ArrayList<>();
    // int[] target = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // list.add(index[i], nums[i]);
    // }
    // for(int i=0;i<nums.length;i++){
    // target[i] = list.get(i);
    // }
    // return target;
    // }

    // this works in vs code not leetcode
    // public static void rotate(int[] nums, int k){
    // int n = nums.length;
    // k=k%n;
    // int[] a1 = new int[n-k];
    // for(int i=0;i<n-k;i++){
    // a1[i] = nums[i];
    // }
    // int[] a2 = new int[k];
    // for(int i=0;i<k;i++){
    // a2[i] = nums[n-k+i];
    // }
    // int[] res = new int[n];
    // System.arraycopy(a2,0,res,0,a2.length);
    // System.arraycopy(a1,0,res,a2.length,a1.length);
    // System.out.println(Arrays.toString(res));
    // }

    // for leetcode:
    // public static void reverse(int[] nums, int start, int end){
    // while (start<end) {
    // int temp = nums[start];
    // nums[start] = nums[end];
    // nums[end] = temp;
    // start++;
    // end--;
    // }
    // }
    // public static void rotating(int[] nums, int k){
    // int n = nums.length;
    // k = k%n;
    // reverse(nums, 0, n-1);
    // reverse(nums, 0, k-1);
    // reverse(nums, k, n-1);
    // }

    // public static int largestAltitude(int[] gain) {
    // int max = gain[0];
    // for(int i=0;i<gain.length;i++){
    // max = Math.max(max, gain[i]);
    // }
    // return max;
    // }

    // public static int count(int n){
    // int c = 0;
    // int temp = n;
    // while (temp>0) {
    // c += 1;
    // temp /= 10;
    // }
    // return c;
    // }

    // public static int findNo(int[] nums){
    // int evenNo = 0;
    // for(int n : nums){
    // int num = count(n);
    // if (num%2 == 0) {
    // evenNo++;
    // }
    // }
    // return evenNo;
    // }

    // public static int[][] rotate(int[][] matrix){
    // int n = matrix.length;
    // int[][] rotated = new int[n][n];
    // for(int i=0;i<matrix.length;i++){
    // for(int j=0;j<matrix.length;j++){
    // rotated[j][n-i-1] = matrix[i][j];
    // }
    // }
    // return rotated;
    // }

    // public static boolean areMaticesEqual(int[][] a, int[][] b){
    // int n = a.length;
    // for(int i=0;i<n;i++){
    // for(int j=0;j<n;j++){
    // if (a[i][j] != b[i][j]) {
    // return false;
    // }
    // }
    // }
    // return true;
    // }

    // public static boolean findRotation(int[][] matrix, int[][] target){
    // for(int i=0;i<4;i++){
    // if (areMaticesEqual(matrix, target)) {
    // return true;
    // }
    // matrix = rotate(matrix);
    // }
    // return false;
    // }

    // public static void setZeros(int[][] matrix){
    // int n = matrix.length;
    // for(int i=0;i<n;i++){
    // for(int j=0;j<n;j++){
    // if (matrix[i][j] == 0) {
    // matrix[i][0] = 0;
    // matrix[0][j] = 0;
    // }
    // }
    // }
    // for(int i=0;i<n;i++){
    // for(int j=0;j<n;j++){
    // if (matrix[i][0] == 0 || matrix[0][j] == 0) {
    // matrix[i][j] = 0;
    // }
    // }
    // }
    // }

    // public static int[] productExceptSelf(int[] nums){
    // int prod = 1;
    // int[] res = new int[nums.length];
    // for(int i=0;i<nums.length;i++){
    // for(int j=0;j<nums.length;j++){
    // if (nums[i]==nums[j]) {
    // continue;
    // }
    // prod = prod*nums[j];
    // }
    // res[i] = prod;
    // }
    // return res;
    // int n = nums.length;
    // int[] res = new int[n];
    // res[0] = 1;
    // for(int i=1;i<n;i++){
    // res[i] = res[i-1] * nums[i-1];
    // }
    // int suffix = 1;
    // for(int i=n-1;i>=0;i--){
    // res[i] = res[i] * suffix;
    // suffix *= nums[i];
    // }
    // return res;
    // }

    // public static void luckyNumbers(int[][] matrix){
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i=0;i<matrix.length;i++){
    // int min = matrix[i][0];
    // for(int j=0;j<matrix.length;j++){
    // if (matrix[i][j]<min) {
    // min = matrix[i][j];
    // }
    // }
    // list.add(min);
    // }
    // int max = list.get(0);
    // for(int i=0;i<list.size();i++){
    // if (list.get(i)>max) {
    // max = list.get(i);
    // }
    // }
    // int[] listreturn = {max};
    // System.out.println(Arrays.toString(listreturn));
    // }

    // Binary search
    // public static int bs(int[] arr, int target){
    // int start = 0;
    // int end = arr.length-1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (arr[mid] == target) {
    // return mid;
    // }
    // else if(target<arr[mid]){
    // end = mid - 1;
    // }
    // else{
    // start = mid + 1;
    // }
    // }
    // return -1;
    // }

    // ceiling of a number
    // public static int ceiling(int[] arr, int target){
    // int start = 0;
    // int end = arr.length - 1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (arr[mid] == target) {
    // return arr[mid];
    // }
    // else if(target<arr[mid]){
    // end = mid - 1;
    // }
    // else{
    // start = mid+1;
    // }
    // }
    // return arr[start];
    // }

    // floor of a number
    // public static int floor(int[] arr, int target){
    // int start = 0;
    // int end = arr.length-1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (arr[mid] == target) {
    // return arr[mid];
    // }
    // else if (target<mid) {
    // end = mid - 1;
    // }
    // else{
    // start = mid + 1;
    // }
    // }
    // return arr[end];
    // }

    // public static char nextGreatestLetter(char[] letters, char target) {
    // int start = 0;
    // int end = letters.length-1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (target<letters[mid]) {
    // end = mid - 1;
    // }
    // else if (target>letters[mid]) {
    // start = mid + 1;
    // }
    // }
    // return letters[start % letters.length];
    // }

    // public static int[] serahRange(int[] nums, int target){
    // int first = findFirst(nums, target);
    // int second = findSecond(nums, target);
    // return new int[] {first, second};
    // }
    // public static int findFirst(int[] nums, int target){
    // int start = 0;
    // int end = nums.length - 1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (nums[mid] == target) {
    // return mid;
    // }
    // if (target<=nums[mid]) {
    // end = mid - 1;
    // }
    // else start = mid + 1;
    // }
    // return -1;
    // }
    // public static int findSecond(int[] nums, int target){
    // int start = 0;
    // int end = nums.length - 1;
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (nums[mid] == target) {
    // return mid;
    // }
    // if (target<=nums[mid]) {
    // end = mid - 1;
    // }
    // else start = mid + 1;
    // }
    // return -1;
    // }

    // public static int peak(int[] nums){
    // int start = 0;
    // int end = nums.length-1;
    // while (start<end) {
    // int mid = start + (end - start)/2;
    // if (nums[mid]>nums[mid+1]) {
    // end = mid;
    // }
    // else{
    // start = mid+1;
    // }
    // }
    // return start;
    // }

    // public static void findkthmissing(int[] arr){
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i=0;i<arr.length;i++){
    // int missing = arr[i] - (i+1);
    // list.add(missing);
    // }
    // System.out.println(list);
    // }

    // public static int countNegatives(int[][] grid){
    // int count = 0;
    // for(int i=0;i<grid.length;i++){
    // for(int j=0;j<grid.length;j++){
    // if (grid[i][j] < 0) {
    // count++;
    // }
    // }
    // }
    // return count;

    // int count = 0;
    // int row = 0;
    // int col = grid[0].length - 1;
    // while (row<grid.length && col>=0) {
    // if (grid[row][col]<0) {
    // count++;
    // }
    // else if(grid[row][col]>)
    // }
    // return count;
    // }

    // rotated bs
    // public static int pivotinRBS(int[] nums){
    // int start = 0;
    // int end = nums.length - 1;
    // while (start<end) {
    // int mid = start + (end - start)/2;
    // if (mid<end && nums[mid]>nums[mid+1]) {
    // return mid;
    // }
    // else if(nums[mid]<nums[mid-1]){
    // end = mid-1;
    // }
    // else {
    // mid = mid+1;
    // }
    // }
    // return -1;
    // }
    // public static int rbs(int[] arr, int target){
    // int pivot = pivotinRBS(arr);
    // if (arr[pivot]==target) {
    // return pivot;
    // }
    // else if(target>arr[0]){
    // return bs(arr, target, 0, pivot-1);
    // }
    // else{
    // return bs(arr, target, pivot+1, arr.length);
    // }
    // }
    // public static int bs(int[] arr, int target, int start, int end){
    // while (start<=end) {
    // int mid = start + (end - start)/2;
    // if (arr[mid] == target) {
    // return mid;
    // }
    // else if (target<arr[mid]) {
    // end = mid - 1;
    // }
    // else{
    // start = mid + 1;
    // }
    // }
    // return -1;
    // }

    // public static String defangIPaddr(String address) {
    // String newAdd = address.replace(".","[.]");
    // return newAdd;
    // }

    // public static String restoreString(String s, int[] indices) {
    //     char[] result = new char[s.length()];
    //     for (int i = 0; i < s.length(); i++) {
    //         result[indices[i]] = s.charAt(i);
    //     }
    //     return new String(result);
    // }

    // public static String interpret(String command) {
    //     return command.replace("()", "o").replace("(al)", "al");
    // }

    // public static String sortSentence(String s) {
    //     String[] arr = s.split(" ");
    //     String[] res = new String[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         int k = arr[i].length() - 1;
    //         int m = arr[i].charAt(k) - '0';
    //         res[m-1] = arr[i].substring(0, k);
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<res.length;i++){
    //         sb.append(res[i]).append(" ");
    //     }
    //     return (sb.toString()).trim();
    // }

    // public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     StringBuilder w1 = new StringBuilder();
    //     StringBuilder w2 = new StringBuilder();
    //     for(String word : word1){
    //         w1.append(word);
    //     }
    //     for(String word : word2){
    //         w2.append(word);
    //     }
    //     return w1.toString().equals(w2.toString());
    // }

    // public static String toLowerCase(String s) {
    //     return s.toLowerCase();
    // }

    // public static boolean halvesAreAlike(String s) {
    //     int k = s.length() % 2;
    //     String firstHalf = "";
    //     String secondHalf = "";
    //     System.arraycopy(s,0,firstHalf,0,k);
    //     System.arraycopy(s, k+1, secondHalf, 0, k);
    // }

    // public static int numOfStrings(String[] patterns, String word) {
    //     int count = 0;
    //     for(String s : patterns){
    //         if (word.contains(s)) count++;
    //     }
    //     return count;
    // }

    // public static boolean robotCircle(String moves){
    //     int x = 0, y = 0;
    //     for(char move : moves.toCharArray()){
    //         if (move == 'L') x--;
    //         else if(move == 'R') x++;
    //         else if(move == 'U') y++;
    //         else if(move == 'D') y--;
    //     }
    //     return x == 0 && y == 0;
    // }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // int[] arr = {0,2,1,5,3,4};
        // System.out.println(Arrays.toString(buildArray(arr)));
        // int[] arr = {1,2,1};
        // System.out.println(Arrays.toString(getConcat(arr)));
        // int[] arr = {1,2,3,4};
        // System.out.println(Arrays.toString(runningSum(arr)));
        // int[][] arr = {
        // {1,5},{7,3},{3,5}
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
        // {0,1},
        // {1,0}
        // };
        // int[][] target = {
        // {1,0},{0,1}
        // };
        // System.out.println(findRotation(matrix, target));

        // int[][] matrix = {
        // {1,1,1},{1,0,1},{1,1,1}
        // };
        // System.out.print(setZeros(matrix));
        // setZeros(matrix);
        // System.out.println(Arrays.toString(matrix));

        // int[] arr = {1,2,3,4};
        // int[] res = productExceptSelf(arr);
        // System.out.println(Arrays.toString(res));

        // int[][] matrix = {
        // {1,10,4,2},
        // {9,3,8,7},
        // {15,16,17,12}
        // };
        // luckyNumbers(matrix);

        // int[] arr = {2,4,6,7,9,11,23,34,67};
        // System.out.println(floor(arr, 3));

        // char[] arr = {'c','f','j'};
        // System.out.println(nextGreatestLetter(arr, 'a'));

        // int[] arr = {5,7,7,8,8,10};
        // System.out.println(Arrays.toString(serahRange(arr, 8)));

        // int[] arr = {0,4,10,5,2};
        // System.out.println(peak(arr));

        // int[] arr = {2,3,4,7,11};
        // findkthmissing(arr);

        // int[][] arr = {
        // {4,3,2,-1}, {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        // };
        // int[][] arr = {{3,2},{1,0}};
        // System.out.println(countNegatives(arr));

        // String s = "codeleet";
        // int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        // System.out.println(restoreString(s, indices));

        // String s = "G()(al)";
        // System.out.println(interpret(s));

        // String s = "Myself2 Me1 I4 and3";
        // System.out.println(sortSentence(s));

        // String[] w1 = {"abc", "d", "defg"};
        // String[] w2 = {"abcddefg"};
        // System.out.println(arrayStringsAreEqual(w1, w2));

        // String s = "Hello";
        // System.out.println(s.toLowerCase());

        // String[] pattern = {"a","abc","bc","d"};
        // String word = "abc";
        // System.out.println(numOfStrings(pattern, word));

        // String moves = "LDRRLRUULR";
        // System.out.println(robotCircle(moves));

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
