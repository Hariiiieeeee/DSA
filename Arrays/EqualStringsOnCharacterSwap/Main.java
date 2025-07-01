// 1790. Check if One String Swap Can Make Strings Equal
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

// Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 

// Example 1:

// Input: s1 = "bank", s2 = "kanb"
// Output: true
// Explanation: For example, swap the first character with the last character of s2 to make "bank".
// Example 2:

// Input: s1 = "attack", s2 = "defend"
// Output: false
// Explanation: It is impossible to make them equal with one string swap.
// Example 3:

// Input: s1 = "kelb", s2 = "kelb"
// Output: true
// Explanation: The two strings are already equal, so no string swap operation is required.

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        int d = 0;
        int[] arr = new int[2];

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(d > 1) return false;
                arr[d] = i;
                d++;
            }
        }

        return d==2 && s1.charAt(arr[0]) == s2.charAt(arr[1]) && s1.charAt(arr[1]) == s2.charAt(arr[0]);
    }
}