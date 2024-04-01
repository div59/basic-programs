''' 
Finding the difference between the largest and smallest from a list of 5 numbers
Input
input 1 : 5
input 2 : 10 11 7 12 14
Output
7
Explanation
The first parameter 5 is the size of the array. Next is array of integers. The difference betweenthe largest(14) and the smallest (7) number is 7

'''
n=int(input())
l=list(map(int,input().split()))
l.sort()
print(abs(l[0]-l[-1]))