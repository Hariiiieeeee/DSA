class Solution:
    def rotateMatrix(self, mat):
        for row in mat:
            row.reverse()
            
        for i in range(0, len(mat)):
            for j in range(i+1, len(mat)):
                mat[i][j], mat[j][i] = mat[j][i], mat[i][j]
                
        return mat
        