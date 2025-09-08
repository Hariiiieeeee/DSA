import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
        System.out.println("hello");
    }

}

public class DoubleLinkedList {
    static Node head;
    static Node tail;

    static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // static ArrayList<ArrayList<Integer>> twoSum(int target){
    //     HashSet<Integer> set = new HashSet<>();
    //     ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    //     Node current = head;
    //     while(current != null){
    //         int diff = target - current.data;

    //         if(set.contains(diff)){
    //             res.add(new ArrayList<>(Arrays.asList(diff, current.data));
    //         }

    //         set.add(current.data);
    //     }

    // }

    static void addLast(int data){
        Node newNode = new Node(data);
        
        if(tail == null){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    static void deleteNode(int data){
        Node temp = head;

        while(temp != null){
            if(temp.data == data){
                if(temp == head && temp == tail){
                    head = null;
                }

                else if(temp.prev == null){
                    head = temp.next;
                    head.prev = null;
                }

                else if(temp.next == null){
                    tail = temp.prev;
                    temp.prev.next = null;
                }

                else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Node deleted successfully!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element not found!");
    }

    static void printList(){
        Node temp = head;

        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        System.out.print("NULL <-> ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void reverse(){
        Node temp = tail;

        System.out.println("NULL");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");

    }

    static void insert(int position, int data){
        if(position == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        while(temp != null){
            if(position == 1){
                if(temp.next == null){
                    addLast(data);
                    return;
                }

                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
                newNode.next.prev = newNode;
                return;
            }

            position--;
            temp = temp.next;
        }

        System.out.println("Insertion failed!");       
    }

    static int max(){
        Node current = head;
        int max = Integer.MIN_VALUE;

        while(current != null){
            max = Math.max(max, current.data);
            current = current.next;
        }

        return max;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        addFirst(10);
        addLast(20);
        addLast(30);

        printList();

        // deleteNode(20);        
        // printList();

        // reverse();

        insert(1, 20);
        printList();


        int target = sc.nextInt();
        System.out.println((target == max())? "True" : "False");        
    }
}
