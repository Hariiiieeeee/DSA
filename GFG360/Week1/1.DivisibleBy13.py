# Check if a larger number is divisible by 13 or not

# comments
# Given a number s represented as a string, determine whether the integer it represents is divisible by 13 or not.

# Examples : 

# Input: s = "2911285"
# Output: true
# Explanation: 2911285 / 13 = 223945, which is a whole number with no remainder.

# Input: s = "27"
# Output: false
# Explanation: 27 / 13 ≈ 2.0769..., which is not a whole number (there is a remainder).

class Solution:
    def divby13(self, s):
        rem = 0
        
        for ch in s:
            rem = (rem * 10 + int(ch)) % 13
        
        return rem == 0