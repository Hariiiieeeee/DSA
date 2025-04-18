// Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
// Example 2:

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".

import java.util.*; 

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()) return res;

        int[] scount = new int[26];
        int[] pcount = new int[26];

        for(int i=0; i<p.length(); i++){
            scount[s.charAt(i) - 'a']++;
            pcount[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(scount, pcount)) res.add(0);

        int left = 0;
        int right = p.length();

        while(right < s.length()){
            scount[s.charAt(right) - 'a']++;
            scount[s.charAt(left) - 'a']--;

            left++;
            right++;

            if(Arrays.equals(scount, pcount)) res.add(left);

        }

        return res;
    }
}