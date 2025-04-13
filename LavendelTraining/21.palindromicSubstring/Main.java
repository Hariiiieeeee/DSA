// Given a string s, find and return the longest palindromic substring in s. 
// Your solution must run in O(n) time.
// A palindromic substring is a substring that reads the same forwards and backwards. 
// Input: s = "babad" 
// Output: "bab"

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String substr = "" + str.charAt(0);
        int maxlen = 1;

        int left;
        int right;

        for(int i=0; i<str.length(); i++){
            // odd
            left = i;
            right = i;
            while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }

            if(right - left - 1 > maxlen){
                maxlen = right - left - 1;
                substr = str.substring(left+1, right);
            }

            // even
            left = i;
            right = i+1;
            while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }

            if(right - left - 1 > maxlen){
                maxlen = right - left - 1;
                substr = str.substring(left+1, right);
            }
        }

        System.out.println(substr);
    }
}