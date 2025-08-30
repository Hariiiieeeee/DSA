class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    static Node head;
    static void addFirst(int val){
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    static void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    static void addLast(int val){
        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(val);
    }

    static void insert(int position, int data){
        Node current = head;

        int len = 0;
        while(current != null){
            current = current.next;
            len++;
        }

        if(position > len){
            System.out.println("Insert position exceeds the list length!");
            return;
        }

        else if(position == 0){
            addFirst(len);
        }

        else if(position == len){
            addLast(len);
        }

        else{
            int count = 1;
            current = head;
            while(count != position){
                current = current.next;
                count++;
            }

            Node temp = current.next;
            current.next = new Node(data, temp);
        }


    }

    static void delete(int data){
        if(head == null){
            System.out.println("List Empty!");
            return;
        }

        
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }
    }

    static void reverse(){
        if(head == null){
            System.out.println("Empty List!");
            return;
        }

        Node prev = null;
        Node current = head;

        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;
    }

    static void middle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

    static int sumOfNodes(){
        if(head == null) return 0;

        Node current = head;
        int sum = 0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }

        return sum; 
    }

    static int count(){
        if(head == null) return 0;

        Node current = head;
        int count = 1;

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    static void minMax(){
        if(head == null) return;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Node current = head;

        while(current != null){
            int val = current.data;

            if(val > max) max = val;

            if(val < min) min = val;

            current = current.next;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        addFirst(1);
        addLast(2);
        addLast(4);
        printList();
        System.out.println();

        insert(2, 3);
        printList();
        System.out.println();

        delete(2);
        printList();
        System.out.println();

        reverse();
        printList();
        System.out.println();

        insert(1, 2);
        middle();

        minMax();

        // addLast(1);
        // addLast(2);
        // addLast(3);
        // addLast(4);
        // addLast(5);

        // System.out.println("Sum of Node: " + sumOfNodes());
        // System.out.println("Count: " + count());

    }
}
