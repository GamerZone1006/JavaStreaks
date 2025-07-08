class Node{
    int height;
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key = key;
        this.height = 1;
    }
}
public class avltree {

    Node root;
    int height(Node n){
        return (n==null) ? 0 : n.height;
    }
    int max(int a, int b){
        return (a > b) ? a : b;
    }

    //left left case
    Node llcase(Node p){
        Node c = p.left;
        Node g = c.left;
        c.right = p;
        p.left = g;
        p.height = 1 + max(height(p.left), height(p.right));
        c.height = 1 + max(height(c.left), height(c.right));
        return c;
    }

    //rr case
    Node rrcase(Node p){
        Node c = p.right;
        Node g = c.right;
        c.left = p;
        p.left = g;
        p.height = 1 + max(height(p.left), height(p.right));
        c.height = 1 + max(height(c.left), height(c.right));
        return c;
    }

    int getBalance(Node p){
        return (p == null) ? 0 : (height(p.left) - height(p.right));
    }

    Node insert(Node p, int key){
        if (p == null) {
            return new Node(key);
        }
        if (key < p.key) {
            p.left = insert(p.left, key);
        }
        else if (key > p.key) {
            p.right = insert(p.right, key);
        }
        else return p;
        p.height = 1 + max(height(p.left), height(p.right));
        int balance = getBalance(p);
        if (balance>1 && key < p.left.key) {
            return rrcase(p);
        }
        if (balance < -1 && key < p.right.key) {
            // p.right = 
        }
    }

    public static void main(String[] args) {
        
    }
}
