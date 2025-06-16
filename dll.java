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

class DoublyLinkedList{
    Node head;
    Node tail;
    public void insertFirst(int val){
        Node  node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    // public void display(){
    //     Node node = head;
    //     while (node != null) {
    //         System.out.print(node.value + " <-> ");
    //         node = node.next;
    //     }
    //     System.out.println("end");
    // }

    public void displayRev(){
        Node last = tail;
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("start");
    }
}

public class dll {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(2);
        // list.display();
        list.displayRev();
    }
}
