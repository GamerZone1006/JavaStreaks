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

class SinglyLinkedList{
    Node head;
    Node tail;
    int size;
    public SinglyLinkedList(){
        size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addEnd(int value){
        if (tail == null) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        size++;
    }

    public void addInBetwn(int val, int index){
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size - 1) {
            addEnd(val);
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("khtm");
    }
}
public class linkedlistpract {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.addEnd(4);
        list.addEnd(3);
        list.display();
    }
}