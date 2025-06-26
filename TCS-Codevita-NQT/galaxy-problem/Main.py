# Constellation Problem
# Three characters {#, *, .} represents a constellation of stars and galaxies in space. Each galaxy is demarcated by # characters. There can be one or many stars in a given galaxy. Stars can only be in the shape of vowels {
# A
# ,
# E
# ,
# I
# ,
# O
# ,
# U
# A,E,I,O,U}. A collection of * in the shape of the vowels is a star. A star is contained in a 3×3 block. Stars cannot be overlapping. The dot(.) character denotes empty space.

# Given 
# 3
# ×
# N
# 3×N matrix comprising of { #, *, . } character, find the galaxy and stars within them.

# Note: Please pay attention to how vowel A is denoted in a 
# 3
# ×
# 3
# 3×3 block in the examples section below.

# Input Format
# Input consists of a single integer 
# N
# N denoting the number of columns.
# Output Format
# The output contains vowels (stars) in order of their occurrence within the given galaxy. The galaxy itself is represented by the # character.

# Constraints
# 3
# ≤
# N
# ≤
# 1
# 0
# 5
# 3≤N≤10 
# 5
 
# Sample 1:
# Input
# Output
# 18
# * . * # * * * # * * * # * * * . * .
# * . * # * . * # . * . # * * * * * *
# * * * # * * * # * * * # * * * * . *
# U#O#I#EA
# Explanation:
# As it can be seen that the stars make the image of the alphabet U, I, and A.

# Sample 2:
# Input
# Output
# 12
# * . * # . * * * # . * .
# * . * # . . * . # * * *
# * * * # . * * * # * . *
# U#I#A
# Explanation:
# As it can be seen that the stars make the image of the alphabet U, I, and A.

def solve():
    n = int(input())
    arr = [input().split() for _ in range(3)]

    result = ""
    i = 0
    while i < n-2:
        if arr[0][i] == '#':
            result += '#'
            i+=1

        elif isA(arr, i):
            result += 'A'
            i+=3
        
        elif isE(arr, i):
            result += 'E'
            i+=3
        
        elif isI(arr, i):
            result += 'I'
            i+=3

        elif isO(arr, i):
            result += 'O'
            i+=3
        
        elif isU(arr, i):
            result += 'U'
            i+=3

        else:
            i+=1

    print(result)


def isA(arr, i):
    return arr[0][i] == '.' and arr[0][i+1] == '*' and arr[0][i+2] == '.' and arr[1][i] == '*' and arr[1][i+1] == '*' and arr[1][i+2] == '*' and arr[2][i] == '*' and arr[2][i+1] == '.' and arr[2][i+2] == '*'

def isI(arr, i):
    return arr[0][i] == '*' and arr[0][i+1] == '*' and arr[0][i+2] == '*' and arr[1][i] == '.' and arr[1][i+1] == '*' and arr[1][i+2] == '.' and arr[2][i] == '*' and arr[2][i+1] == '*' and arr[2][i+2] == '*'

def isE(arr, i):
    return arr[0][i] == '*' and arr[0][i+1] == '*' and arr[0][i+2] == '*' and arr[1][i] == '*' and arr[1][i+1] == '*' and arr[1][i+2] == '*' and arr[2][i] == '*' and arr[2][i+1] == '*' and arr[2][i+2] == '*'

def isO(arr, i):
    return arr[0][i] == '*' and arr[0][i+1] == '*' and arr[0][i+2] == '*' and arr[1][i] == '*' and arr[1][i+1] == '.' and arr[1][i+2] == '*' and arr[2][i] == '*' and arr[2][i+1] == '*' and arr[2][i+2] == '*'

def isU(arr, i):
    return arr[0][i] == '*' and arr[0][i+1] == '.' and arr[0][i+2] == '*' and arr[1][i] == '*' and arr[1][i+1] == '.' and arr[1][i+2] == '*' and arr[2][i] == '*' and arr[2][i+1] == '*' and arr[2][i+2] == '*'

solve()