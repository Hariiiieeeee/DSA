// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int n = s.length();
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for(int i=0; i<n; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }

            int len = (i-l)+1;
            maxLen = Math.max(maxLen, len);
            set.add(s.charAt(i));
        }

        return maxLen;
    }
}