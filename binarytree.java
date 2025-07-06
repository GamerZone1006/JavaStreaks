// import java.util.Scanner;

// class Node{
//     int value;
//     Node left, right;
//     public Node(int value){
//         this.value = value;
//     }
// }

// public class binarytree {
//     Node root;
//     void preorder(Node node){
//         if (node == null) {
//             return;
//         }
//         System.out.print(node.value+" ");
//         preorder(node.left);
//         preorder(node.right);
//     }
//     void postorder(Node node){
//         if (node == null) {
//             return;
//         }
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value+" ");
//     }
//     void inorder(Node node){
//         if (node == null) {
//             return;
//         }
//         inorder(node.left);
//         System.out.print(node.value+" ");
//         inorder(node.right);
//     }
//     public static void main(String[] args) {
//         binarytree tree = new binarytree();
//         tree.root = new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);
//         tree.root.right.left = new Node(6);
//         tree.root.right.right = new Node(7);
//         System.out.print("Inorder traversal: ");
//         tree.inorder(tree.root);
//         System.out.println();
//         System.out.print("Preorder traversal: ");
//         tree.preorder(tree.root);
//         System.out.println();
//         System.out.println("Postorder traversal: ");
//         tree.postorder(tree.root);
//         System.out.println();
//     }
// }

import java.util.Scanner;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value = value;
    }
}
public class binarytree {
    Node root;
    public void populate(Scanner sc){
        System.out.println("Enter root node value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populateHelper(sc, root);
    }
    public void populateHelper(Scanner sc, Node node){
        System.out.print("Do u want to add left node: ");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.print("Enter value of left node: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populateHelper(sc, node.left);
        }

        System.out.print("Do u wanna add right node: ");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.print("Enter value of right node: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populateHelper(sc, node.right);
        }
    }
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
        Scanner sc = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.populate(sc);
        System.out.print("\nInorder traversal: ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder traversal: ");
        tree.preorder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
        sc.close();
    }
}