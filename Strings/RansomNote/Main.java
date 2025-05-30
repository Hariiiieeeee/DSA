// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m = new HashMap<>();

        for(char i : magazine.toCharArray()){
            if(m.containsKey(i)) m.put(i, m.get(i) + 1);

            else m.put(i, 1);
        }

        for(char i : ransomNote.toCharArray()){
            if(!m.containsKey(i) || m.get(i) == 0) return false;

            m.put(i, m.get(i)-1);
        }

        return true;
    }
}