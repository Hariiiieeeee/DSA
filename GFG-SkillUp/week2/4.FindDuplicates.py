class Solution:
    def findDuplicates(self, arr):
        freq = {}
        
        for i in arr:
            freq[i] = freq.get(i, 0) + 1
        
        return [nums for nums in freq if freq[nums] > 1]