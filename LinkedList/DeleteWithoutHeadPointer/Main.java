// Delete without head pointer
// Difficulty: EasyAccuracy: 78.57%Submissions: 213K+Points: 2
// You are given a node del_node of a Singly Linked List where you have to delete a value of the given node from the linked list but you are not given the head of the list.

// By deleting the node value, we do not mean removing it from memory. We mean:

// The value of the given node should not exist in the linked list.
// The number of nodes in the linked list should decrease by one.
// All the values before & after the del_node node should be in the same order.
// Note:

// Multiple nodes can have the same values as the del_node, but you must only remove the node whose pointer del_node is given to you.
// It is guaranteed that there exists a node with a value equal to the del_node value and it will not be the last node of the linked list.
// Examples:

// Input: Linked List = 1 -> 2, del_node = 1
// Output: 2
// Explanation: After deleting 1 from the linked list, we have remaining nodes as 2.
 
// Input: Linked List = 10 -> 20 -> 4 -> 30, del_node = 20
// Output: 10->4->30
// Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.


//{ Driver Code Starts
import java.io.*;
import java.util.*;

// Node class definition
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// GFG class containing methods for linked list operations
public class GFG {
    // Function to print the linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Function to find a node in the list
    static Node findNode(Node head, int searchFor) {
        Node current = head;
        while (current != null) {
            if (current.data == searchFor) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Solution ob = new Solution(); // Create an instance of Solution class
        while (t-- > 0) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            int k = Integer.parseInt(br.readLine());
            Node del = findNode(head, k); // Find the node to be deleted

            if (del != null) {
                ob.deleteNode(del); // Delete the node
                printList(head);    // Print the updated list
            } else {
                System.out.println("Node with value " + k + " not found.");
            }
        }
    }
}

// } Driver Code Ends


/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

// Function to delete a node without any reference to head pointer.
class Solution {
    void deleteNode(Node node) {
        if(node == null || node.next == null) return;
        
        node.data = node.next.data;
        
        node.next = node.next.next;
    }
}
