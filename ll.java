class Node {
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

class LinkedList{
    Node head;
    Node tail;
    int size;
    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertEnd(int value){
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insertInBetwn(int value, int index){
        if (index == 0) {
            insertEnd(value);
            return;
        }
        if (index == size) {
            insertEnd(value);
            return;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == tail) {
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteInBetwn(int index){
        if (index==0) {
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        size++;
        System.out.println("null");
    }
}

public class ll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(4);    
        list.insertEnd(5);
        list.insertInBetwn(7, 1);
        list.insertInBetwn(6, 2);
        list.display();
        // list.deleteFirst();
        // list.deleteLast();
        list.deleteInBetwn(2);
        list.display();
    }
}
