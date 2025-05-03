// Prime List
// Difficulty: MediumAccuracy: 53.68%Submissions: 34K+Points: 4
// You are given the head of a linked list. You have to replace all the values of the nodes with the nearest prime number. If more than one prime number exists at an equal distance, choose the smallest one. Return the head of the modified linked list.

// Examples :

// Input: head = 2 → 6 → 10
// Output: 2 → 5 → 11

// Explanation: The nearest prime of 2 is 2 itself. The nearest primes of 6 are 5 and 7, since 5 is smaller so, 5 will be chosen. The nearest prime of 10 is 11.
// Input: head = 1 → 15 → 20
// Output: 2 → 13 → 19

// Explanation: The nearest prime of 1 is 2. The nearest primes of 15 are 13 and 17, since 13 is smaller so, 13 will be chosen. The nearest prime of 20 is 19.

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;

class Node {
    Node next;
    int val;

    public Node(int data) {
        val = data;
        next = null;
    }
}

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t;
        t = Integer.parseInt(in.readLine());
        while (t-- > 0) {

            Node head, tail;
            String s[] = in.readLine().trim().split(" ");
            int num = Integer.parseInt(s[0]);
            head = new Node(num);
            tail = head;
            for (int i = 1; i < s.length; i++) {
                num = Integer.parseInt(s[i]);
                tail.next = new Node(num);
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node temp = ob.primeList(head);
            while (temp != null) {
                out.print(temp.val + " ");
                temp = temp.next;
            }
            out.println();
            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution {
    boolean isPrime(int n){
        if(n == 1) return false;
        
        if(n == 2) return true;
        
        if(n%2 == 0) return false;
        
        for(int i=3; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        
        return true;
    }
    
    Node primeList(Node head) {
        Node temp = head;
        
        while(temp != null){
            int num = temp.val;
            
            if(isPrime(num)){
                temp = temp.next;
                continue;
            }
            
            int i=1;
            while(true){
                if(num-i > 1 && isPrime(num-i)){
                    temp.val = num-i;
                    break;
                }else if(isPrime(num+i)){
                    temp.val = num+i;
                    break;
                }
                
                i++;
            }
            
            temp = temp.next;
        }
        
        return head;
        
    }
}