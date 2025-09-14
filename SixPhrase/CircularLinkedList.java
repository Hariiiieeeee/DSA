
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class CircularLinkedList {
    static Node head;
    static Node tail;

    static void createNewList(int[] arr){
        for(int i: arr){
            Node newNode  = new Node(i);
            if(head == null){
                head = newNode;
                newNode.next = head;
                tail = head;
                continue;
            }

            tail.next = newNode;
            newNode.next = head;
            tail = newNode; 
        }
    }

    static void printList(){
        Node current = head;
        while(current != tail){
            System.err.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data + " -> ");
    }

    static void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    static void insertAtTail(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        createNewList(arr);
        printList();

        insertAtHead(0);
        printList();

        insertAtTail(5);
        printList();
    }
}
