class Solution:
    def extractPoints(self, arr):
        res = []
        
        res.append(arr[0])
        
        for i in range(1, len(arr)-1):
            if arr[i] > res[-1] and arr[i] > arr[i+1]:
                res.append(arr[i])
                
            elif arr[i] < res[-1] and arr[i] < arr[i+1]:
                res.append(arr[i])
                
        
        if res[-1] != arr[-1]:
            res.append(arr[-1])
        
        
        return res
        