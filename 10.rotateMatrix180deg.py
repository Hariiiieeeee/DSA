class Solution:
	def rotateMatrix(self, mat):
		for i in mat:
            i.reverse()
            
        top = 0
        bottom = len(mat)-1
        
        while top < bottom:
            mat[top], mat[bottom] = mat[bottom], mat[top]
            top+=1
            bottom-=1
            
        return mat