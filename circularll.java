class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}

class CCLL{
    Node head;
    Node tail;
    public CCLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null) {
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            while(node != head);
        }
        System.out.println("khtm");
    }
}

public class circularll {
    public static void main(String[] args) {
        CCLL list = new CCLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
    }
}
