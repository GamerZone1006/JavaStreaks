import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class praciticefromstart {
    // Permutation of arrays
    // public static int[] buildArray(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         ans[i] = nums[nums[i]];
    //     }
    //     return ans;
    // }

    // concatenation of arrays

    // public static int[] getConcat(int[] nums) {
    //     int[] nums2 = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         nums2[i] = nums[i];
    //     }
    //     int n1 = nums.length;
    //     int n2 = nums2.length;
    //     int[] ans = new int[n1 + n2];
    //     System.arraycopy(nums, 0, ans, 0, n1);
    //     System.arraycopy(nums, 0, ans, n1, n2);
    //     return ans;
    // }

    // running sum

    // public static int[] runningSum(int[] nums) {
    //     int sum = 0;
    //     int[] res = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         sum += nums[i];
    //         res[i] = sum;
    //     }
    //     return res;
    // }

    // sabse ameera aadmi

    // public static int maxWealth(int[][] accounts) {
    //     int richManMoney = 0;
    //     for (int i = 0; i < accounts.length; i++) {
    //         int sum = 0;
    //         for (int j = 0; j < accounts[i].length; j++) {
    //             sum += accounts[i][j];
    //         }
    //         richManMoney = Math.max(richManMoney, sum);
    //     }
    //     return richManMoney;
    // }

    // shuffle array

    // public static int[] shuffle(int[] nums, int n) {
    //     // int[] res = new int[2*n];
    //     int[] res = new int[2 * n];
    //     for (int i = 0; i < n; i++) {
    //         res[2 * i] = nums[i];
    //         res[2 * i + 1] = nums[i + n];
    //     }
    //     return res;
    // }

    // spiral matrix

    // public static int[][] spiralnxn(int n) {
    //     int[][] martix = new int[n][n];
    //     int num = 1;
    //     int top = 0;
    //     int bottom = n - 1;
    //     int left = 0;
    //     int right = n - 1;
    //     while (num <= n * n) {
    //         for (int i = left; i <= right; i++) {
    //             martix[top][i] = num++;
    //         }
    //         top++;
    //         for (int i = top; i <= bottom; i++) {
    //             martix[i][right] = num++;
    //         }
    //         right--;
    //         if (top <= bottom) {
    //             for (int i = right; i >= left; i--) {
    //                 martix[bottom][i] = num++;
    //             }
    //             bottom--;
    //         }
    //         if (left <= right) {
    //             for (int i = bottom; i >= top; i--) {
    //                 martix[i][left] = num++;
    //             }
    //             left++;
    //         }
    //     }
    //     return martix;
    // }

    // public int noofGoodPairs(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int count = 0;
    //     for (int n : nums) {
    //         int c = map.getOrDefault(n, 0);
    //         count += c;
    //         map.put(n, c + 1);
    //     }
    //     return count;
    // }

    // public static int[] smallerthanCurrent(int[] nums) {
    //     int[] res = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int count = 0;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[i] > nums[j]) {
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
    //     for (int i = 0; i < nums.length; i++) {
    //         list.add(index[i], nums[i]);
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         target[i] = list.get(i);
    //     }
    //     return target;
    // }

    // this

    // works in
    // vs code
    // not leetcode

    // public static void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     int[] a1 = new int[n - k];
    //     for (int i = 0; i < n - k; i++) {
    //         a1[i] = nums[i];
    //     }
    //     int[] a2 = new int[k];
    //     for (int i = 0; i < k; i++) {
    //         a2[i] = nums[n - k + i];
    //     }
    //     int[] res = new int[n];
    //     System.arraycopy(a2, 0, res, 0, a2.length);
    //     System.arraycopy(a1, 0, res, a2.length, a1.length);
    //     System.out.println(Arrays.toString(res));
    // }

    // for leetcode:

    // public static void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    // public static void rotating(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     reverse(nums, 0, n - 1);
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, n - 1);
    // }

    // public static int largestAltitude(int[] gain) {
    //     int max = gain[0];
    //     for (int i = 0; i < gain.length; i++) {
    //         max = Math.max(max, gain[i]);
    //     }
    //     return max;
    // }

    // public static int count(int n) {
    //     int c = 0;
    //     int temp = n;
    //     while (temp > 0) {
    //         c += 1;
    //         temp /= 10;
    //     }
    //     return c;
    // }

    // public static int findNo(int[] nums) {
    //     int evenNo = 0;
    //     for (int n : nums) {
    //         int num = count(n);
    //         if (num % 2 == 0) {
    //             evenNo++;
    //         }
    //     }
    //     return evenNo;
    // }

    // public static int[][] rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     int[][] rotated = new int[n][n];
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix.length; j++) {
    //             rotated[j][n - i - 1] = matrix[i][j];
    //         }
    //     }
    //     return rotated;
    // }

    // public static boolean areMaticesEqual(int[][] a, int[][] b) {
    //     int n = a.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (a[i][j] != b[i][j]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // public static boolean findRotation(int[][] matrix, int[][] target) {
    //     for (int i = 0; i < 4; i++) {
    //         if (areMaticesEqual(matrix, target)) {
    //             return true;
    //         }
    //         matrix = rotate(matrix);
    //     }
    //     return false;
    // }

    // public static void setZeros(int[][] matrix) {
    //     int n = matrix.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 matrix[i][0] = 0;
    //                 matrix[0][j] = 0;
    //             }
    //         }
    //     }
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][0] == 0 || matrix[0][j] == 0) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    // public static int[] productExceptSelf(int[] nums) {
    //     int prod = 1;
    //     int[] res = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 continue;
    //             }
    //             prod = prod * nums[j];
    //         }
    //         res[i] = prod;
    //     }
    //     return res;
    //     int n = nums.length;
    //     int[] res = new int[n];
    //     res[0] = 1;
    //     for (int i = 1; i < n; i++) {
    //         res[i] = res[i - 1] * nums[i - 1];
    //     }
    //     int suffix = 1;
    //     for (int i = n - 1; i >= 0; i--) {
    //         res[i] = res[i] * suffix;
    //         suffix *= nums[i];
    //     }
    //     return res;
    // }

    // public static void luckyNumbers(int[][] matrix) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < matrix.length; i++) {
    //         int min = matrix[i][0];
    //         for (int j = 0; j < matrix.length; j++) {
    //             if (matrix[i][j] < min) {
    //                 min = matrix[i][j];
    //             }
    //         }
    //         list.add(min);
    //     }
    //     int max = list.get(0);
    //     for (int i = 0; i < list.size(); i++) {
    //         if (list.get(i) > max) {
    //             max = list.get(i);
    //         }
    //     }
    //     int[] listreturn = { max };
    //     System.out.println(Arrays.toString(listreturn));
    // }

    // Binary search

    // public static int bs(int[] arr, int target) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] == target) {
    //             return mid;
    //         } else if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // ceiling of
    // a number

    // public static int ceiling(int[] arr, int target) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] == target) {
    //             return arr[mid];
    //         } else if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return arr[start];
    // }

    // floor of
    // a number

    // public static int floor(int[] arr, int target) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] == target) {
    //             return arr[mid];
    //         } else if (target < mid) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return arr[end];
    // }

    // public static char nextGreatestLetter(char[] letters, char target) {
    //     int start = 0;
    //     int end = letters.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (target < letters[mid]) {
    //             end = mid - 1;
    //         } else if (target > letters[mid]) {
    //             start = mid + 1;
    //         }
    //     }
    //     return letters[start % letters.length];
    // }

    // public static int[] serahRange(int[] nums, int target) {
    //     int first = findFirst(nums, target);
    //     int second = findSecond(nums, target);
    //     return new int[] { first, second };
    // }

    // public static int findFirst(int[] nums, int target) {
    //     int start = 0;
    //     int end = nums.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (nums[mid] == target) {
    //             return mid;
    //         }
    //         if (target <= nums[mid]) {
    //             end = mid - 1;
    //         } else
    //             start = mid + 1;
    //     }
    //     return -1;
    // }

    // public static int findSecond(int[] nums, int target) {
    //     int start = 0;
    //     int end = nums.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (nums[mid] == target) {
    //             return mid;
    //         }
    //         if (target <= nums[mid]) {
    //             end = mid - 1;
    //         } else
    //             start = mid + 1;
    //     }
    //     return -1;
    // }

    // public static int peak(int[] nums) {
    //     int start = 0;
    //     int end = nums.length - 1;
    //     while (start < end) {
    //         int mid = start + (end - start) / 2;
    //         if (nums[mid] > nums[mid + 1]) {
    //             end = mid;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return start;
    // }

    // public static void findkthmissing(int[] arr) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         int missing = arr[i] - (i + 1);
    //         list.add(missing);
    //     }
    //     System.out.println(list);
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

    // public static int pivotinRBS(int[] nums) {
    //     int start = 0;
    //     int end = nums.length - 1;
    //     while (start < end) {
    //         int mid = start + (end - start) / 2;
    //         if (mid < end && nums[mid] > nums[mid + 1]) {
    //             return mid;
    //         } else if (nums[mid] < nums[mid - 1]) {
    //             end = mid - 1;
    //         } else {
    //             mid = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static int rbs(int[] arr, int target) {
    //     int pivot = pivotinRBS(arr);
    //     if (arr[pivot] == target) {
    //         return pivot;
    //     } else if (target > arr[0]) {
    //         return bs(arr, target, 0, pivot - 1);
    //     } else {
    //         return bs(arr, target, pivot + 1, arr.length);
    //     }
    // }

    // public static int bs(int[] arr, int target, int start, int end) {
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] == target) {
    //             return mid;
    //         } else if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static String defangIPaddr(String address) {
    //     String newAdd = address.replace(".", "[.]");
    //     return newAdd;
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
    //     for (int i = 0; i < arr.length; i++) {
    //         int k = arr[i].length() - 1;
    //         int m = arr[i].charAt(k) - '0';
    //         res[m - 1] = arr[i].substring(0, k);
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < res.length; i++) {
    //         sb.append(res[i]).append(" ");
    //     }
    //     return (sb.toString()).trim();
    // }

    // public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     StringBuilder w1 = new StringBuilder();
    //     StringBuilder w2 = new StringBuilder();
    //     for (String word : word1) {
    //         w1.append(word);
    //     }
    //     for (String word : word2) {
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
    //     System.arraycopy(s, 0, firstHalf, 0, k);
    //     System.arraycopy(s, k + 1, secondHalf, 0, k);
    // }

    // public static int numOfStrings(String[] patterns, String word) {
    //     int count = 0;
    //     for (String s : patterns) {
    //         if (word.contains(s))
    //             count++;
    //     }
    //     return count;
    // }

    // public static boolean robotCircle(String moves) {
    //     int x = 0, y = 0;
    //     for (char move : moves.toCharArray()) {
    //         if (move == 'L')
    //             x--;
    //         else if (move == 'R')
    //             x++;
    //         else if (move == 'U')
    //             y++;
    //         else if (move == 'D')
    //             y--;
    //     }
    //     return x == 0 && y == 0;
    // }

    // public static String reverseWords(String s) {
    //     String[] words = s.split(" ");
    //     StringBuilder result = new StringBuilder();
    //     for (String word : words) {
    //         result.append(new StringBuilder(word).reverse().toString());
    //         result.append(" ");
    //     }
    //     return result.toString().trim();
    // }

    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> list = new HashSet<>();
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length - 2; i++) {
    //         for (int j = i + 1; j < nums.length - 1; j++) {
    //             for (int k = j + 1; k < nums.length; k++) {
    //                 if (nums[i] + nums[j] + nums[k] == 0) {
    //                     List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
    //                     list.add(triplet);
    //                 }
    //             }
    //         }
    //     }

    //     return new ArrayList<>(list);
    // }

    // public static String[] findWords(String[] words) {
    //     ArrayList<String> res = new ArrayList<>();
    //     for (String ch : words) {
    //         if (containsLetterfromDiff(ch) == true) {
    //             res.add(ch);
    //         }
    //     }
    //     return res.toArray(new String[0]);
    // }

    // public static boolean containsLetterfromDiff(String s) {
    //     s = s.toLowerCase();
    //     String upper = "qwertyuiop";
    //     String mid = "asdfghjkl";
    //     String lower = "zxcvbnm";
    //     String word = null;
    //     char first = s.charAt(0);
    //     if (upper.indexOf(first) != -1) {
    //         word = upper;
    //     } else if (mid.indexOf(first) != -1) {
    //         word = mid;
    //     } else {
    //         word = lower;
    //     }
    //     for (char c : s.toCharArray()) {
    //         if (word.indexOf(c) == -1) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void reverseString(char[] s) {
    //     int start = 0;
    //     int end = s.length - 1;
    //     while (start < end) {
    //         char temp = s[start];
    //         s[start] = s[end];
    //         s[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     System.out.println(s);
    // }

    // public static String reverseVowels(String s) {
    //     char[] word = s.toCharArray();
    //     int start = 0;
    //     int end = s.length() - 1;
    //     String vowel = "aeiouAEIOU";
    //     while (start < end) {
    //         while (start < end && vowel.indexOf(word[start]) == -1) {
    //             start++;
    //         }
    //         while (start < end && vowel.indexOf(word[end]) == -1) {
    //             end--;
    //         }
    //         char temp = word[start];
    //         word[start] = word[end];
    //         word[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     String ans = new String(word);
    //     return ans;
    // }

    // public static int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int comp = target - nums[i];
    //         if (map.containsKey(comp)) {
    //             return new int[] { map.get(comp), i };
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return new int[] {};
    // }

    // public static boolean containsDuplicate(int[] nums) {
    //     HashSet<Integer> seen = new HashSet<>();
    //     for (int num : nums) {
    //         if (seen.contains(num)) {
    //             return true;
    //         }
    //         seen.add(num);
    //     }
    //     return false;
    // }

    // public static int firstUniqChar(String s) {
    //     char[] rep = s.toCharArray();
    //     HashMap<Character, Integer> unique = new HashMap<>();
    //     for (char ch : rep) {
    //         unique.put(ch, unique.getOrDefault(ch, 0) + 1);
    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         if (unique.get(s.charAt(i)) == 1) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Linear Search
    // public static int linearSearch(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (target == arr[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //Binary Search
    // public static int binarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start<=end) {
    //         int mid = start + (end - start)/2;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         else if(target<arr[mid]){
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    //Patterns
    // public static void sqPattern(int n){
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void halfRightTri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void revHalTri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=(n-i+1);j>=1;j--){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hallowSq(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             if (i==1 || i==n) {
    //                 System.out.print(" * ");
    //             }
    //             if (j==1 || j==n) {
    //                 System.out.print(" * ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static int missing(int[] nums){
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for(int i=0;i<n;i++){
    //         if (nums[i] != i) {
    //             return i;
    //         }
    //     }
    //     return n;
    // }

    // public static boolean ifExist(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i] == 2*arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public static int countNegatives(int[][] grid){
    //     int count = 0;
    //     for(int i=0;i<grid.length;i++){
    //         for(int j=0;j<grid.length;j++){
    //             if (grid[i][j] < 0) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // public static int findDist(int[] arr1, int[] arr2, int d){
    //     int count = 0;
    //     for(int i=0;i<arr1.length;i++){
    //         boolean isIt = true;
    //         for(int j=0;j<arr2.length;j++){
    //             if (Math.abs(arr1[i] - arr2[j]) <= d) {
    //                 isIt = false;
    //                 break;
    //             }
    //         }
    //         if (isIt) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static int specialArray(int[] nums){
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for(int i=1;i<n;i++){
    //         int index = greaterOrEqualTo(nums, i);
    //         int count = n - index;
    //         if (count == i) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static int greaterOrEqualTo(int[] arr, int x){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int res = arr.length;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (arr[mid]>=x) {
    //             res = mid;
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return res;
    // }

    // public static List<Integer> targetIndices(int[] nums, int target){
    //     List<Integer> list = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //         if (nums[i] == target) {
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }

    // public static int maximumCount(int[] nums) {
    //     int pos = 0;
    //     int neg = 0;
    //     for(int i=0;i<nums.length;i++){
    //         if (nums[i] < 0) {
    //             neg++;
    //         }
    //         else if(nums[i]>0){
    //             pos++;
    //         }
    //     }
    //     return Math.max(pos, neg);
    // }

    // public static int getCommon(int[] nums1, int[] nums2) {
    //     ArrayList<Integer> common = new ArrayList<>();
    //     for(int i : nums1){
    //         for(int j : nums2){
    //             if (nums1[i] == nums2[j]) {
    //                 common.add(nums1[i]);
    //             }
    //             else{
    //                 common.add(-1);
    //             }
    //         }
    //     }
    //     int min = Collections.min(common);
    //     return min;
    // }

    // public static int findMin(int[] nums){
    //     int min = nums[0];
    //     for(int i=0;i<nums.length;i++){
    //         if (nums[i]<min) {
    //             min = nums[i];
    //         }
    //     }
    //     return min;
    // }

    // public static int[] twoSum(int[] numbers, int target) {
    //     int res[] = new int[2];
    //     int i=1;
    //     int j=1;
    //     while (i!=numbers.length && j!=numbers.length) {
    //         if (numbers[i] + numbers[j] != target) {
    //             res[0] = i;
    //             res[1] = j;
    //         }
    //         i++;
    //         j++;
    //     }
    //     return res;
    // }

    // public static int[] twoSum(int[] numbers, int target) {
    //     int res[] = {-1, -1};
    //     for(int i=0;i<numbers.length;i++){
    //         int comp = target - numbers[i];
    //         int index = binarySearch(numbers, i+1, numbers.length - 1, comp);
    //         if (index != -1) {
    //             res[0] = i;
    //             res[1] = index;
    //         }
    //     }
    //     return res;
    // }

    // public static int binarySearch(int[] nums, int start, int end, int target) {
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (nums[mid] == target) return mid;
    //         else if (nums[mid] < target) start = mid + 1;
    //         else end = mid - 1;
    //     }
    //     return -1;
    // }

    // public static boolean searchMatrix(int[][] matrix, int target) {
        
    // }
    // public static int pivot(int)

    // public static int findDuplicate(int[] nums) {
    //     int i=0;
    //     while (i<nums.length) {
    //         int correctInd = nums[i]-1;
    //         if (nums[i] != nums[correctInd]) {
    //             int temp = nums[i];
    //             nums[i] = nums[correctInd];
    //             nums[correctInd] = temp;
    //         }
    //         else{i++;}
    //     }
    //     for(int j=0;j<nums.length;j++){
    //         if(j+1 != nums[j]){
    //             return nums[j];
    //         }
    //     }
    //     return -1;
    // }

    // public static int kthSmallest(int[][] matrix, int k) {
    //     ArrayList<Integer> oneD = new ArrayList<>();
    //     for(int[] row : matrix){
    //         for(int elem : row){
    //             oneD.add(elem);
    //         }
    //     }
    //     Collections.sort(oneD);
    //     if (k>0 && k<=oneD.size()) {
    //         return oneD.get(k-1);
    //     }
    //     return -1;
    // }

    // public static boolean find132pattern(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
                // for(int k=j+1;k<nums.length;k++){
                    // if (i<j<k && nums[i] < nums[k] < nums[j]) {
                    //     return true;
                    // }
    //                 return (nums[i] < nums[k] < nums[j]);
    //             }
    //         }
    //     }
    // }

    // public static boolean isAnagram(String s, String t){
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     char[] sString = s.toCharArray();
    //     char[] tString = t.toCharArray();
    //     Arrays.sort(sString);
    //     Arrays.sort(tString);
    //     return Arrays.equals(sString, tString);
    // }

    // public static int[] intersection(int[] nums1, int[] nums2){
    //     HashSet<Integer> set = new HashSet<>();
    //     HashSet<Integer> res = new HashSet<>();
    //     for(int num : nums1){
    //         set.add(num);
    //     }
    //     for(int num : nums2){
    //         if (set.contains(num)) {
    //             res.add(num);
    //         }
    //     }
    //     int[] ans = new int[res.size()];
    //     int i=0;
    //     for(int num : res){
    //         ans[i++] = num;
    //     }
    //     return ans;
    // }

    // public static int[] intersection(int[] nums1, int[] nums2){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if (nums1[i] == nums2[j]) {
    //                 res.add(nums1[i]);
    //             }
    //         }
    //     }
    //     int[] nums = new int[res.size()];
    //     for(int i=0;i<res.size();i++){
    //         nums[i] = res.get(i);                   
    //     }
    //     return nums;
    // }

    // public static char findTheDifference(String s, String t) {
    //     char[] sString = s.toCharArray();
    //     char[] tString = t.toCharArray();
    //     Arrays.sort(sString);
    //     Arrays.sort(tString);
    //     for(int i=0;i<sString.length;i++){
    //         if (sString[i] != tString[i]) {
    //             return tString[i];
    //         }
    //     }
    //     return tString[tString.length - 1];
    // }

    // public static void reverse(int[] arr) {
    //     int left = 0;
    //     int right = arr.length - 1;

    //     while (left < right) {
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }

    // public static int thirdMax(int[] nums) {
    //     int thmax = 0;
    //     Arrays.sort(nums);
    //     reverse(nums);
    //     for(int i=0;i<nums.length;i++){
    //         if (nums.length > 2) {
    //             thmax = nums[2];
    //         }
    //         else{
    //             thmax = nums[0];
    //         }
    //     }
    //     return thmax;
    // }

    // public static int possibleStringCount(String word) {
    //     int count = 0;
    //     for(int i=0;i<word.length()-1;i++){
    //         if(word.charAt(i) == word.charAt(i+1)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static ListNode swap(ListNode head){
    //     ListNode current = head;
    //     ListNode next = current.next;
    //     while(current != null && current.next != null){
            
    //     }
    // }

    // public static int findLucky(int[] arr){
    //     int[] freq = new int[500];
    //     for(int num : arr){
    //         freq[num]++;
    //     }
    //     for(int i = 1;i<=500;i++){
    //         if (freq[i]==i) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static ListNode oddEvenList(ListNode head) {
    //     ListNode evenHead = new ListNode(0);
    //     ListNode oddHead = new ListNode(0);
    //     ListNode even = evenHead;
    //     ListNode odd = oddHead;
    //     for(int i=1;i<=head.length;i++){
    //         if(i%2==0){
    //             even.next = head;
    //             even = even.next;
    //         }
    //         else{
    //             odd.next = head;
    //             odd = odd.next;
    //         }
    //     }
    //     odd.next = null;
    //     even.next = oddHead.next;
    //     return evenHead.next;
    // }

    // public static ListNode modifiedList(int[] nums, ListNode head) {
    //     ListNode list = new ListNode(0);
    //     ArrayList<Integer> arrnums = new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         arrnums.add(nums[i]);
    //     }
    //     for(int number : head){
    //         if (!head.contains(arrnums)) {
    //             list.add(number);
    //         }
    //     }
    //     return list;
    // }

    // public static String multiply(String num1, String num2) {
    //     float n1 = Integer.parseInt(num1);
    //     float n2 = Integer.parseInt(num2);
    //     int prod = (int)(n1 * n2);
    //     return Integer.toString(prod);
    // }

    // public static void tri(int[] arr){
    //     if(arr.length < 1) return;
    //     int[] temp = new int[arr.length - 1];
    //     for(int i=0;i<arr.length-1;i++){
    //         temp[i] = arr[i] + arr[i+1];
    //     }
    //     tri(temp);
    //     System.out.println(Arrays.toString(temp));
    // }

    // public static int[] sortedSquares(int[] nums) {
    //     int[] sq = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         sq[i] = nums[i]*nums[i];
    //     }
    //     Arrays.sort(sq);
    //     return sq;
    // }

    // public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     backtrack(candidates, target, 0, new ArrayList<>(), res);
    //     return res;
    // }
    // private static void backtrack(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> result) {
    //     if (target == 0) {
    //         result.add(new ArrayList<>(path));
    //         return;
    //     }
    //     if (target < 0 || index == candidates.length) {
    //         return;
    //     }
    //     path.add(candidates[index]);
    //     backtrack(candidates, target - candidates[index], index, path, result); 
    //     path.remove(path.size() - 1); 
    //     backtrack(candidates, target, index + 1, path, result);
    // }

    //binary search using recursion
    public static int search(int[] nums, int target){
        return helper(nums, target, 0, nums.length-1);
    }
    public static int helper(int[] nums, int target, int start, int end){
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target<nums[mid]) {
                return helper(nums, target, start, mid-1);
            }
            else{
                return helper(nums, target, mid+1, end);
            }
        }
        return -1;
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

        // System.out.println(reverseWords("Let's take LeetCode contest"));

        // int[] arr = {-1,0,1,2,-1,-4};
        // System.out.println(threeSum(arr));

        // String[] arr = {"Hello","Alaska","Dad","Peace"};
        // System.out.println(Arrays.toString(findWords(arr)));

        // char[] s = {'h','e','l','l','o'};
        // reverseString(s);

        // int[] arr = {2,7,11,15};
        // System.out.println(Arrays.toString(twoSum(arr, 9)));

        // int[] arr = { 1, 2, 3, 1 };
        // System.out.println(containsDuplicate(arr));

        // int[] arr = {1,3,4,5,10, 12, 22, 34, 45,66};
        // System.out.println(binarySearch(arr, 22));

        // sqPattern(5);
        // halfRightTri(5);
        // revHalTri(5);
        // hallowSq(5);

        // int[] arr = {9,6,4,2,3,5,7,0,1};
        // int[] arr = {0,1};
        // System.out.println(missing(arr));

        // int[] arr = {7,1,14,11};
        // System.out.println(ifExist(arr));

        // int[][] grid = {
        //     {5,1,0},{-5,-5,-5}
        // };
        // System.out.println(countNegatives(grid));

        // int[] arr1 = {4,5,8};
        // int[] arr2 = {10,9,1,8};
        // System.out.println(findDist(arr1, arr2, 2));

        // int[] arr = {1,2,5,2,3};
        // System.out.println(targetIndices(arr,5));

        // int[] arr = {4,5,6,7,0,1,2};
        // System.out.println(findMin(arr));

        // int[] arr = {2,7,11,15};
        // System.out.println(Arrays.toString(twoSum(arr, 9)));

        // int[] arr = {3,1,3,4,2};
        // System.out.println(findDuplicate(arr));

        // int[][] arr = {
        //     {1,2},{1,3}
        // };
        // System.out.println(kthSmallest(arr, 2));

        // int[] nums1 = {1,2,2,1};
        // int[] nums2 = {2,2};
        // System.out.println(Arrays.toString(intersection(nums1, nums2)));

        // String s = "";
        // String t = "y";
        // System.out.println(findTheDifference(s, t));

        // int[] arr = {2,2,3,4};
        // System.out.println(findLucky(arr));

        // System.out.println(multiply("2", "3"));

        // int[] arr = {1,2,3,4,5};
        // tri(arr);
        
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
}
