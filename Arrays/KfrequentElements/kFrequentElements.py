# Top K Frequent Elements
# Solved 
# Given an integer array nums and an integer k, return the k most frequent elements within the array.

# The test cases are generated such that the answer is always unique.

# You may return the output in any order.

# Example 1:

# Input: nums = [1,2,2,3,3,3], k = 2

# Output: [2,3]
# Example 2:

# Input: nums = [7,7], k = 1

# Output: [7]

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}

        for i in nums:
            counter[i] = counter.get(i, 0) + 1

        arr = []
        for i, j in counter.items():
            arr.append([j, i])
        
        arr.sort(reverse=True)

        res = []
        for i in range(k):
            res.append(arr[i][1])
               

        return res