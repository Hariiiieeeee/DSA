class Solution:
    def reverse_arr(self, arr, start, end):
        
        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start+=1
            end-=1
            
        
    def rotateclockwise(self, arr, k):
        n = len(arr)
        
        k = k%n
        
        if k == 0:
            return arr
            
        self.reverse_arr(arr, 0, n-1)
        self.reverse_arr(arr, 0, k-1)
        self.reverse_arr(arr, k, n-1)
        
        return arr
        
