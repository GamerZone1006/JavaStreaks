import java.util.*;

public class stack {
    public static void main(String[] args) {
        //Stack
        // Stack<Integer> st = new Stack<>();
        // st.push(3);
        // st.push(2);
        // st.push(1);
        // System.out.println(st);
        //push
        //pop
        //peek
        //blah blah blah

        //Queue
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);

        //Dequeue
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(9);
        dq.addFirst(20);
        System.out.println(dq);
    }
}
