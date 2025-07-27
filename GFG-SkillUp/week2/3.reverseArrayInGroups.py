class Solution:
    def reverse_arr(self, arr, start, end):
        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            
            start+=1
            end-=1
        
    def reverseingroups(self, arr, k):
        start = 0
        end = k-1
        n = len(arr)
        
        while end < n:
            self.reverse_arr(arr, start, end)
            start += k
            end += k
        
        self.reverse_arr(arr, start, n-1)
        
        return arr