class Solution:
    def majorityElement(self, arr):
        el = arr[0]
        count = 0
        
        for i in arr:
            if count == 0:
                el = i
                count = 1
            elif i == el:
                count+=1
            else:
                count -= 1
                
        count = 0
        for i in arr:
            if el == i:
                count += 1
        
        if count > len(arr)//2 :
            return el
        
        return -1