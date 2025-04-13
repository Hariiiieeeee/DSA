// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 1;
        String subStr = "" + s.charAt(0);

        int left, right;

        for(int i=0; i<s.length(); i++){
            // odd
            left = i;
            right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            if(right - left - 1 > maxLen){
                maxLen = right - left - 1;
                subStr = s.substring(left+1, right);
            }

            // Even
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            if(right - left - 1 > maxLen){
                maxLen = right - left - 1;
                subStr = s.substring(left+1, right);
            }
        }

        return subStr;
    }
}