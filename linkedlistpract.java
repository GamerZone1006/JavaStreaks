// class Node{
//     int value;
//     Node next;
//     public Node(int value){
//         this.value = value;
//     }
//     public Node(int value, Node next){
//         this.value = value;
//         this.next = next;
//     }
// }

// class SinglyLinkedList{
//     Node head;
//     Node tail;
//     int size;
//     public SinglyLinkedList(){
//         size = 0;
//     }

//     public void insertFirst(int val){
//         Node node = new Node(val);
//         node.next = head;
//         head = node;
//         if (tail == null) {
//             tail = head;
//         }
//         size++;
//     }

//     public void addEnd(int value){
//         if (tail == null) {
//             insertFirst(value);
//         }
//         Node node = new Node(value);
//         tail.next = node;
//         tail = node;
//         size++;
//     }

//     public void addInBetwn(int val, int index){
//         if (index == 0) {
//             insertFirst(val);
//             return;
//         }
//         if (index == size - 1) {
//             addEnd(val);
//             return;
//         }
//         else{
//             Node temp = head;
//             for(int i=0;i<index;i++){
//                 temp = temp.next;
//             }
//             Node node = new Node(val, temp.next);
//             temp.next = node;
//             size++;
//         }
//     }

//     public Node get(int index){
//         Node node = head;
//         for(int i=0;i<index;i++){
//             node = node.next;
//         }
//         return node;
//     }

//     public void delFirst(){
//         head = head.next;
//         if (head == tail) {
//             tail = null;
//         }
//         size--;
//     }

//     public void delLast(){
//         if (tail == head) {
//             delFirst();
//         }
//         tail = get(size-2);
//         tail.next = null;
//         size--;
//     }

//     public void delInBetwn(int index){
//         if (index == 0) {
//             delFirst();
//             return;
//         }
//         if (index == size) {
//             delLast();
//             return;
//         }
//         Node prev = get(index-1);
//         prev.next = prev.next.next;
//     }

//     public void display(){
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.value + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("khtm");
//     }
// }

class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next, Node prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLL{
    Node head;
    Node tail;
    int size;
    public DoublyLL(int size){
        this.size = size;
    }
    
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void addEnd(int val){
        if (tail == null) {
            addFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void addInBetwen(int val, int index){
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size) {
            addEnd(val);
            return;
        }
        Node after = get(index);
        Node before = after.prev;
        Node node = new Node(val);
        node.prev = before;
        node.next = after;
        before.next = node;
        after.prev = node;
    }

    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode pres = head;
    //     ListNode next = pres.next;
    //     while(pres != null){
    //         pres.next = prev;
    //         prev = pres;
    //         pres = next;
    //         if(next != null){
    //             next = next.next;
    //         }
    //     }
    //     head = prev;
    //     return head;
    // }

    public Node revserseList(Node head){
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // public Boolean isPalin(Node head){
    //     Node copy = head;
    //     Node rev = revserseList(head);
    //     Node temp1 = copy;
    //     Node temp2 = rev;
    //     while (temp1 != null && temp2 != null) {
    //         if (temp1.value != temp2.value) {
    //             return false;
    //         }
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //     }
    //     return false;
    // }

    public Node middlNode(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Boolean isPalin(Node head){
        Node mid = middlNode(head);
        Node headSecond = revserseList(mid);
        Node rev = headSecond;
        while (headSecond != null && rev != null) {
            if (headSecond.value != rev.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        revserseList(rev);
        if (head == null || headSecond == null) {
            return true;
        }
        return false;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("khtm");
    }

    public void reroder(Node head){
        Node mid = middlNode(head);
        Node secondPart = revserseList(mid);
        Node rev = secondPart;
        while (head != null && secondPart != null) {
            head.next = secondPart;
        }
    }
}

public class linkedlistpract {
    public static void main(String[] args) {
        // SinglyLinkedList list = new SinglyLinkedList();
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.addEnd(4);
        // list.addEnd(3);
        // list.addInBetwn(4, 1);
        // list.delFirst();
        // list.delLast();
        // list.delInBetwn(2);
        // list.display();

        DoublyLL list = new DoublyLL(0);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addEnd(0);
        list.addEnd(9);
        // list.addInBetwen(5, 2);
        // reverseList(list);

        list.display();
    }
}