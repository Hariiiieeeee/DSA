class Solution:
    def swapDiagonal(self, arr):
        n = len(arr)
        for i in range(0, n):
            arr[i][i], arr[i][n-i-1] = arr[i][n-i-1], arr[i][i]
        
        return arr
