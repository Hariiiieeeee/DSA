// Problem Statement
// David finds some strings containing only ‘)’ and ‘(‘ parentheses. He is keen to find the length of largest substring that formed the valid bracket sequence. But he does not know how to do it, so help him to find the length of largest valid bracket substring in the given string.

// Input Format
// The first line contains an integer n – the size of the string.
// The second line contains the ‘n’ character of the string.
// Output Format
// Print a single integer - the length of the largest valid substring
// Constraints
// 0 <= n <= 10000.
// String contains only ‘(‘ and ‘)’.
// Sample Testcase 0
// Testcase Input
// 3
// (()
// Testcase Output
// 2
// Explanation
// 2 is the largest valid substring the given string.
// Sample Testcase 1
// Testcase Input
// 6
// )()())
// Testcase Output
// 4
// Explanation
// ()() is the largest valid substring which has of length 4.

import java.util.*;

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int maxLen = 0;

        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for(int i=0; i<n; i++){
            if(str.charAt(i) == '('){
                s.push(i);
            }

            else{
                if(!s.isEmpty()) s.pop();

                if(s.isEmpty()) s.push(i);
                
                else{
                    maxLen = Math.max(maxLen, i-s.peek());
                }
            }
        }

        System.out.println(maxLen);
    }
}