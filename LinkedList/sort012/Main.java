// Sort a linked list of 0s, 1s and 2s
// Difficulty: MediumAccuracy: 60.75%Submissions: 246K+Points: 4Average Time: 30m
// Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.


//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    
    static Node segregate(Node head) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0) zeros++;
            else if(temp.data == 1) ones++;
            else twos++;
            
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            if(zeros > 0){
                temp.data = 0;
                zeros--;
            }
            
            else if(ones > 0){
                temp.data = 1;
                ones--;
            }
            
            else{
                temp.data = 2;
                twos--;
            }
            
            temp = temp.next;
        }
        
        return head;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends