// Problem Statement
// Ravi discovered that some strings read the same forwards and backwards, which are called palindromes.

// He noticed that every string he encountered has at least one palindromic substring. He wants to know how to find the longest palindromic substring in a given string, S.

// Can you help him determine the length of this longest palindromic substring?

// Input Format
// The first line of input contains an integer N representing the length of the string.

// The second line of input a string S representing the given string whose longest substring we have to find.

// Output Format
// Display an integer representinhg the length of the longest palindromic substring that is possible.

// Constraints
// 1<= N <=10^7

// Sample Testcase 0
// Testcase Input
// 5 
// abacc
// Testcase Output
// 3
// Explanation
// The given string is abacc The possible palindromic substrings present are ‘a’, ‘b,’ ‘c,’ ‘aba,’ ‘cc,’ and the longest substring is ‘aba’ of length 3.

// Sample Testcase 1
// Testcase Input
// 6
// abcdef
// Testcase Output
// 1
// Explanation
// The given string is abcdef The possible palindromic substrings are ‘a’, ‘b,’ ‘c,’ ‘’d, ‘e,’ ‘f.’ The length of the longest palindromic substring is 1

import java.util.Scanner;

public class Main {
    public static int checkFromCetre(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
    
    public static int longestPalindromicSubstringLength(int n, String s) {
        int maxLen = 1;

        for(int i=0; i<n; i++){
            maxLen = Math.max(maxLen, checkFromCetre(s, i, i));
            maxLen = Math.max(maxLen, checkFromCetre(s, i, i+1));
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int result = longestPalindromicSubstringLength(n, s);
        System.out.println(result);
    }
}