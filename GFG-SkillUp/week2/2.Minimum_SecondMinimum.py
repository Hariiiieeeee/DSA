class Solution:
    def minAnd2ndMin(self, arr):
        
        min1 = min2 = float('inf')
        
        for i in arr:
            if i < min1:
                min2, min1 = min1, i
            
            elif min1 < i < min2:
                min2 = i
        
        if min2 == float('inf') or min1 == min2:
            return [-1]
        
        return [min1, min2]
                
    
        
