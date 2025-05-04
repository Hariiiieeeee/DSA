// Identical Linked Lists
// Difficulty: BasicAccuracy: 47.49%Submissions: 170K+Points: 1Average Time: 20m
// Given the two singly Linked Lists respectively. The task is to check whether two linked lists are identical or not. 
// Two Linked Lists are identical when they have the same data and with the same arrangement too. If both Linked Lists are identical then return true otherwise return false. 

// Examples:

// Input: LinkedList1: 1->2->3->4->5->6, LinkedList2: 99->59->42->20
// Output: false
// Explanation:

// As shown in figure linkedlists are not identical.
// Input: LinkedList1: 1->2->3->4->5, LinkedList2: 1->2->3->4->5
// Output: true
// Explanation: 
 
// As shown in figure both are identical.
// Expected Time Complexity: O(n)
// Expected Auxilliary Space: O(1)

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution obj = new Solution();
            if (obj.areIdentical(num1, num2))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }

    public static void po(Object o) { System.out.println(o); }

    public static void show(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        Node list1 = head1;
        Node list2 = head2;
        
        while(list1 != null || list2 != null){
            if(list1 == null || list2 == null || list1.data != list2.data){
                return false;
            }
            
            list1 = list1.next;
            list2 = list2.next;
        }
        
        return true;
        
    }
}