// Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
 

// Example 1:

// Input: s = "abcde", words = ["a","bb","acd","ace"]
// Output: 3
// Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
// Example 2:

// Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
// Output: 2

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashSet<String> valid = new HashSet<>();
        HashSet<String> inValid = new HashSet<>();

        for(String str : words){
            if(valid.contains(str)){
                count++;
            }
            else if(inValid.contains(str)){
                continue;
            }
            else{
                int i=0;
                int j=0;

                while(i<str.length() && j<s.length()){
                    if(str.charAt(i) == s.charAt(j)) i++;

                    j++;
                }

                if(i == str.length()){ 
                    count++;
                    valid.add(str);
                }else inValid.add(str);
            }
        }

        return count;
    }
}