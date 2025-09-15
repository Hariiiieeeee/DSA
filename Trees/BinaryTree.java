import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root;
    Scanner sc = new Scanner(System.in);

    Node createNode(){

        int data = sc.nextInt();

        if(data == -1) return null;

        Node newNode = new Node(data);

        System.out.println("Enter left Node: ");
        newNode.left = createNode();

        System.out.println("Enter right Node: ");
        newNode.right = createNode();

        return newNode;
    }
    
    void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " -> ");
            inorder(node.right);
        }
    }

    void preorder(Node node){
        if(node != null){
            System.out.print(node.data + " -> ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " -> ");
        }
    }

    void levelorder(Node node){
        Queue<Node> q = new LinkedList<>();

        if(node == null) return;
        
        q.add(node);

        while(!q.isEmpty()){
            Node current = q.poll();
            System.out.print(current.data + " -> ");

            if(current.left != null) q.add(current.left);

            if(current.right != null) q.add(current.right);
        }

    }
    
    void array
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.createNode();

        System.out.println("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Levelorder: ");
        tree.levelorder(tree.root);
        System.out.println();

    }
}
