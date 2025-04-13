// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// // Output: [-1,-1]

class Solution {
    public int binarySearch(int[] arr, int target, boolean first){
        int result = -1;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                result = mid;

                if(first) right = mid-1;

                else left = mid+1;
            }

            else if(target < arr[mid]) right = mid-1;

            else left = mid+1;
        }

        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);

        return res;        
    }
}