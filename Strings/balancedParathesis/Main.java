//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                stack.push(i);
            }
            
            else{
                if(stack.isEmpty()) return false;
                
                else{
                    char j = stack.pop();
                    if((j == '(' && i == ')') || (j == '{' && i == '}') || (j == '[' && i == ']')) continue;
                    
                    else return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
