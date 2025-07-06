import java.util.Scanner;

class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
    }
}

public class binarytree {
    Node root;
    // public void populate(Scanner sc){
    //     System.out.println("Enter root node: ");
    //     int value = sc.nextInt();
    //     root = new Node(value);
    // }
    void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node){
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }
    void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}
