# 🔍 Problem: Missing and Repeating Number
# Given:

# An array arr[] of size n

# Elements from 1 to n

# One number is missing

# One number repeats twice

# Goal: Return both numbers: [repeating, missing]

class Solution:
    def findTwoElement(self, arr):
        n = len(arr)
        
        n_sum = n*(n+1) // 2
        n2_sum = n*(n+1) * (2 * n+1) // 6
        
        actual_n = sum(arr)
        actual_n2 = sum( i*i for i in arr)
        
        diff1 = actual_n - n_sum
        diff2 = actual_n2 - n2_sum
        
        sum_xy = diff2 // diff1
        
        x = (diff1 + sum_xy) // 2
        y = x - diff1
        
        return [x, y]

