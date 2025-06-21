// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Stack;

// class StackUseKarkeQueue{
//     Stack<Integer> s1;
//     Stack<Integer> s2;
//     public StackUseKarkeQueue(){
//         s1 = new Stack<>();
//         s2 = new Stack<>();
//     }

//     public void enqueue(int item){
//         s1.push(item);
//     }

//     public int dequeue() throws Exception{
//         if (isEmpty()) {
//             throw new Exception("Queue is empty.");
//         }
//         while (!s1.isEmpty()) {
//             s2.push(s1.pop());
//         }
//         return s2.pop();
//     }

//     public int peek() throws Exception{
//         if (isEmpty()) {
//             throw new Exception("Queue is empty");
//         }
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         return s2.peek();
//     }

//     public boolean isEmpty(){
//         return s1.isEmpty() && s2.isEmpty();
//     }
// }

// class TwoStacks{
//     static int stackgamesmtg(int x, int[] a, int[] b){
//         return stackgamesmtg(x, a, b, 0, 0);
//     }
//     private static int stackgamesmtg(int x, int[] a, int[] b, int sum, int count){
//         if (a.length == 0 || b.length == 0) {
//             return count;
//         }
//         int ans1 = stackgamesmtg(x, Arrays.copyOfRange(a, 1, a.length), b, sum, count);
//         int ans2 = stackgamesmtg(x, a, Arrays.copyOfRange(b, 1, b.length), sum, count);
//         return Math.max(ans1, ans2);     
//     }
// }

public class queueusingstack{

    // public boolean isValid(String s){
    //     Stack<Character> stack = new Stack<>();
    //     for(char ch : s.toCharArray()){
    //         if (ch == '(' || ch == '{' || ch == '[') {
    //             stack.push(ch);
    //         }
    //         else{
    //             if (ch == ')') {
    //                 if (stack.isEmpty() || stack.pop() != '(') {
    //                     return false;
    //                 }
    //             }
    //             if (ch == '}') {
    //                 if (stack.isEmpty() || stack.pop() != '{') {
    //                     return false;
    //                 }
    //             }
    //             if (ch == ']') {
    //                 if (stack.isEmpty() || stack.pop() != '[') {
    //                     return false;
    //                 }
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // sc.close();
    }
}