
public class binarysearch {
    // public static int bs(int[] arr, int target, int start, int end){
    //     start = 0;
    //     end = arr.length - 1;
    //     while(start<=end){
    //         int mid = (end - start)/2 + start;
    //         if (arr[mid] == target) {
    //             return mid;
    //         }
    //         else if (target< arr[mid]) {
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static boolean isAesc(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     if (arr[start]<arr[end]) {
    //         return true;
    //     }
    //     return false;
    // }

    // public static int oabs(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if (isAesc(arr)) {
    //             if(target<arr[mid]) end = mid - 1;
    //             else start = mid + 1;
    //         }
    //         else{
    //             if(target>arr[mid]) end = mid - 1;
    //             else start = mid + 1;
    //         }
    //     }
    //     return - 1;
    // }

    // public static int ceiling(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             return mid;
    //         }
    //         if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return arr[start];
        // for floor of element return arr[end];
    // }

    // public static char ceil(char[] letters, char target){
    //     int start = 0;
    //     int end = letters.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if(target<letters[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return letters[start % letters.length];
    // }

    // public static ArrayList<Integer> aagePeeche(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (start<= end) {
    //         int mid = (end - start)/2 + start;
    //         int peeche = arr.length - mid;
    //         if (arr[mid] == target) {
    //             res.add(mid);
    //             res.add(peeche);
    //         }
    //         if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     return res;
    // }

    // public static ArrayList<Integer> occur(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int first = -1;
    //     int last = -1;
    //     ArrayList<Integer> res = new ArrayList<>();
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             first = mid;
    //             end = mid - 1;
    //         }
    //         else if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     start = 0;
    //     end = arr.length - 1;
    //     while (start<=end) {
    //         int mid = (end - start)/2 + start;
    //         if (target == arr[mid]) {
    //             last = mid;
    //             start = mid + 1;
    //         }
    //         else if(target<arr[mid]) end = mid - 1;
    //         else start = mid + 1;
    //     }
    //     res.add(first);
    //     res.add(last);
    //     return res;
    // }

    // public static int infArray(int[] arr, int target){
    //     int start = 0;
    //     int end = 1;
    //     while (target<arr[end]) {
    //         int newStart = end + 1;
    //         end = end + (end - start + 1)*2;
    //         start = newStart;
    //     }
    //     return bs(arr, target, start, end);
    // }

    // public static int binarySearch(int[] arr, int target, int start, int end){
    //     while(start<=end){
    //         int mid = start + (end - start)/2;
    //         if(target == arr[mid]){
    //             return mid;
    //         }
    //         else if(target<arr[mid]){
    //             end = mid - 1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }
    //     return -1;
    // }
 
    // public static int findRange(int[] arr, int target){
    //     int start = 0;
    //     int end = 1;
    //     while(end<arr.length && arr[end] < target){
    //         start = end;
    //         end = 2*end;
    //         if(end >= arr.length){
    //             end = arr.length - 1;
    //             break;
    //         }
    //     }
    //     return binarySearch(arr, target, start, end);
    // }

    // public int findInMountainArray(int target, MountainArray mountainArr) {
    //     int n = mountainArr.length();
    //     int start = 0;
    //     int end = n-1;
    //     int mid = -1;
    //     while(start<=end){
    //         mid = start + (end - start)/2;
    //         int current = mountainArr.get(mid);
    //         if(mid != 0 && mid != n-1 && current>mountainArr.get(mid-1)  && current > mountainArr.get(mid+1)){
    //             return mid;
    //         }
    //         break;
    //         else if(mid != n-1 && current < mountainArr.get(mid+1)){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid -1;
    //         }
    //     }
    //     start = 0;
    //     end = mid - 1;
    //     while(start<=end){
    //         int m = start + (end - start)/2;
    //         int val = mountainArr.get(m);
    //         if(val == target){
    //             return m;
    //         }
    //         else if(target<val){
    //             end = m-1;
    //         }
    //         else{
    //             start = m+1;
    //         }
    //     }  
    // }

    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int[] res = new int[nums1.length + nums2.length];
    //     System.arraycopy(nums1, 0, res, 0, nums1.length);
    //     System.arraycopy(nums2, 0, res, nums1.length, res.length);
    //     Arrays.sort(res);
    //     int low = 0;
    //     int high = res.length - 1;
    //     double median = (low + high)/2;
    //     return median;
    // }

    // public static String 
    // public int maximumLength(int[] nums) {
    //     int count = 0;
    //     int i=0;
    //     while(i = nums.length(nums)){
    //         if(isModulo){
    //             count += 1;
    //         }
    //     }
    //     return count;
    // }
    // public int minimumLength(String str) {
    //     int n = str.length();
    //     int p = 0;
    //     int s = n - 1;
    //     while (p<s && str.charAt(p) == str.charAt(s)) {
    //         int ch = str.charAt(p);
    //         while (p<=s && str.charAt(p) == ch) {
    //             p++;
    //         }
    //         while (p<=s && str.charAt(s) == ch) {
    //             s--;
    //         }
    //     }
    //     return (s-p+1);
    // }

    //fibonacci numbers
    // public static int fib(int n){
    //     if(n<2){
    //         return n;
    //     }
    //     return fib(n-1) + fib(n-2);
    // }

    //power of 3
    // public static boolean isPow(int n){
    //     if(n == 1) return true;
    //     if(n == 0 || n%3 != 0) return false;
    //     else return isPow(n/3);
    // }

    //number of steps to reduce to 0
    // public static int noofsteps(int num){
    //     if(num == 0) return 0;
    //     if(num%2 == 0){
    //         return 1+noofsteps(num/2);
    //     }
    //     else{
    //         return 1+noofsteps(num-1);
    //     }
    // }

    //N Queens
    // public static List<List<String>> solveNQueens(int n){
    //     boolean[][] board = new boolean[n][n];
    //     int row = 0;
    //     List<List<String>> res = new ArrayList<>();
    //     queens(board, res, row);
    //     return res;
    // }
    // public static void queens(boolean[][] board, List<List<String>> res, int row){
    //     if(row == board.length){
    //         res.add(display(board));
    //         return;
    //     }
    //     for(int col = 0; col<board.length; col++){
    //         if(isSafe(board, row, col)){
    //             board[row][col] = true;
    //             queens(board, res, row+1);
    //             board[row][col] = false;
    //         }
    //     }
    // }
    // public static List<String> display(boolean[][] board){
    //     List<String> res = new ArrayList<>();
    //     for(boolean[] row : board){
    //         StringBuilder sb = new StringBuilder();
    //         for(boolean element : row){
    //             if(element){
    //                 sb.append("Q");
    //             }
    //             else{
    //                 sb.append(".");
    //             }
    //         }
    //         res.add(sb.toString());
    //     }
    //     return res;
    // }
    // public static boolean isSafe(boolean[][] board, int row, int col){
        //vertical check
        // for(int i=0;i<row;i++){
        //     if(board[i][col]) return false;
        // }
        //upper left diagonal
        // for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
        //     if(board[i][j]) return  false;
        // }
        //upper right diagonal
    //     for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
    //         if(board[i][j]) return false;
    //     }
    //     return true;
    // }

    // public static List<List<Integer>> comboSum(int[] candidates, int target){
    //     List<List<Integer>> res = new ArrayList<>();
    //     backtrack(candidates, target, 0, res, new ArrayList<>());
    //     return res;
    // }
    // public static void backtrack(int[] candidates, int target, int index, List<List<Integer>> res, List<List<Integer>> path){
    //     if(target == 0){
    //         res.addAll(new ArrayList<>(path));
    //         return;
    //     }
    //     if(target<0 || index = candidates.length) return;
    //     path.add(candidates[index]);
    //     backtrack(candidates, target-candidates[index], index, res, path);
    //     path.remove(path.size()-1);
    // }

    // public static boolean isMountArray(int[] arr){
    //     int index = 0;
    //     int n = arr.length;
    //     while(index < n-1){
    //         if(arr[index] < arr[index + 1]){
    //             index++;
    //         }
    //         else break;
    //     }
    //     if(index == 0 || index == n-1) return false;
    //     while(index < n-1){
    //         if(arr[index] > arr[index + 1]) index++;
    //         else break;
    //     }
    //     return (index == n-1);
    // }

    // public boolean areSentencesSimilar(String sentence1, String sentence2) {
    //     if(sentence1.length() > sentence2.length()){
    //         areSentencesSimilar(sentence2, sentence1);
    //     }
    //     String[] larger = sentence1.split(" ");
    //     String[] smaller = sentence2.split(" ");
    //     int start = 0;
    //     int end1 = larger.length - 1;
    //     int end2 = smaller.length - 1;
    //     while(start<=end1 && smaller[start].equals(larger[start])){
    //         start++;
    //     }
    //     while(start<=end1 && smaller[end1].equals(larger[end2])){
    //         end1--;
    //         end2--;
    //     }
    //     return (start>=end1);
    // }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int extraSpace = 0;
        for(int space : spaces){
            sb.insert(space + extraSpace, " ");
            extraSpace++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // int[] arr = {2,3, 13, 17, 20, 23, 34, 30, 20};
        // int target = 16;
        // int res = bs(arr, target);
        // int res = oabs(arr, target);
        // int res = ceiling(arr, target);
        // System.out.println(res);
        // char[] letter = {'c','f','j'};
        // char target = 'a';
        // char res = ceil(letter, target);
        // System.out.println(res);
        // int target = 17;
        // ArrayList<Integer> res = aagePeeche(arr, target);
        // int[] arr = {1, 1, 1, 2, 2, 2, 2, 2};
        // int target = 2;
        // ArrayList<Integer> res = occur(arr, target);
        // int target = 55;
        // int res = infArray(arr, target);
        // System.out.println(res);
        // System.out.println(findRange(arr, 20));
        // System.out.println(isPow(27));
        // System.out.println(noofsteps(14));
        // System.out.println(isMountArray(arr));
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(s, spaces));
    }
}
