class Solution:
    def spirallyTraverse(self, arr):
        top = 0
        bottom = len(arr)-1
        left = 0
        right = len(arr[0])-1
       
        res = []
       
        while left <= right and top <= bottom:
            for i in range(left, right+1):
                res.append(arr[top][i])
            
            top +=1
            
            if top <= bottom:
                for i in range(top, bottom+1):
                    res.append(arr[i][right])
                    
                right -= 1
            
            if left <= right and top <= bottom:
                for i in range(right, left-1, -1):
                    res.append(arr[bottom][i])
                
                bottom -= 1
            
            if left <= right and top <= bottom:
                for i in range(bottom, top-1, -1):
                    res.append(arr[i][left])
                    
                left += 1
            
        return res
            
               
       
            