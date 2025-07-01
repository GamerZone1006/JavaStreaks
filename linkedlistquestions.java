class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

class LLQuestions{
    Node head;
    Node tail;
    int size;
    Node next;
    public LLQuestions(){
        this.size = 0;
    }

    //insert using recursion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
        size++;
        Node temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        tail = temp;
    }
    private Node insertRec(int val, int index, Node node){
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    //remove duplicates
    public Node getValue(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void remove(int index){
        if (index == 0) {
            head = head.next;
            return;
        }
        if (index == size-1) {
            tail.next = null;
            return;
        }
        Node prev = getValue(index-1);
        prev.next = prev.next.next;
        size--;
    }
    public void removeDuplicates(){
        Node current = head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
                size--;
            }
            else{
                current = current.next;
            }
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public Node mergesort(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = fast.next;
        }
        if (fast == slow) {
            return true;
        }
        return false;
    }

    // finding if a number is happy or not
    public int sq(int n){
        int ans = 0;
        while (n>0) {
            int temp = n%10;
            ans += temp*temp;
            n = n/10;
        }
        return ans;
    }
    public boolean isHappy(int n){
        int f = n;
        int s = n;
        do{
            s = sq(s);
            f= sq(sq(f));
        }while(s != f);
        if (s == 1) {
            return true;
        }
        return false;
    }

    //Reverse a linkedlist 
    public void revese(){
        Node prev = null;
        Node pres = head;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    //delete a given node in a linkedlist
    // public Node del(Node head){
    //     Node node = head;
    //     while (node != null) {
    //         if (node.value == val) {
    //             node = node.next;
    //         }    
    //     }
    // }

    public static LinkNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null) {
                a = headB;
            }
            else{
                a = a.next;
            }
            if (b == null) {
                b = b.headA;
            }
            else{
                b = b.next;
            }
        }
    }
}

// import java.util.LinkedList;
// import java.util.Collections;

public class linkedlistquestions {
    public static void main(String[] args) {
        // LLQuestions list = new LLQuestions();

        // list.insertRec(1, 0);
        // list.insertRec(1, 1);
        // list.insertRec(2, 2);
        // list.insertRec(3, 3);
        // list.insertRec(3, 4);
        // list.removeDuplicates();
        // list.display();

        // LinkedList<Integer> l1 = new LinkedList<>();
        // l1.add(1);
        // l1.add(3);
        // l1.add(5);
        // LinkedList<Integer> l2 = new LinkedList<>();
        // l2.add(1);
        // l2.add(2);
        // l2.add(9);
        // l2.add(14);
        // l1.addAll(l2);
        // Collections.sort(l1);
        // System.out.println(l1);

        // LLQuestions list1 = new LLQuestions();
        // LLQuestions list2 = new LLQuestions();
        // list1.insertRec(1, 0);
        // list1.insertRec(3, 1);
        // list1.insertRec(5, 2);
        // list2.insertRec(1, 0);
        // list2.insertRec(2, 1);
        // list2.insertRec(9, 2);
        // list2.insertRec(14, 3);
        // LLQuestions mergedList = new LLQuestions();
        // mergedList.head = mergedList.mergesort(list1.head, list2.head);
        // mergedList.display();
        
        // LLQuestions happy = new LLQuestions();
        // System.out.println(happy.isHappy(14));
    }
}
