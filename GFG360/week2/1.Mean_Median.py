class Solution:
    def median(self, arr):
        arr.sort()
        
        mid = len(arr) // 2
        
        if len(arr) & 1 == 0:
            return (arr[mid] + arr[mid-1]) // 2
        
        else:
            return arr[mid]
            
    
    def mean(self, arr):
        sum = 0
        for i in arr:
            sum += i
        
        return sum // len(arr)