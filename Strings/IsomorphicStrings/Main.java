// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> smap = new HashMap<>();
        HashMap <Character, Character> tmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if((smap.containsKey(s1) && smap.get(s1) != t1) || (tmap.containsKey(t1) && tmap.get(t1) != s1)){
                return false;
            }

            smap.put(s1, t1);
            tmap.put(t1, s1);
        }

        return true;
    }
}
 