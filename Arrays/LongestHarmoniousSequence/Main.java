// We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

 

// Example 1:

// Input: nums = [1,3,2,2,5,2,3,7]

// Output: 5

// Explanation:

// The longest harmonious subsequence is [3,2,2,2,3].

// Example 2:

// Input: nums = [1,2,3,4]

// Output: 2

// Explanation:

// The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

// Example 3:

// Input: nums = [1,1,1,1]

// Output: 0

// Explanation:

// No harmonic subsequence exists.

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxLength = 0;
        for(int i : map.keySet()){
            if(map.containsKey(i+1)){
                int len = map.get(i) + map.get(i+1);
                maxLength = Math.max(len, maxLength);
            }
        }

        return maxLength;
    }
}