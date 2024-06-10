
'''
Given a matrix of m*n size, the task is to count all the rows in a matrix
that are sorted either in strictly increasing order or in strictly decreasing order?
Input : m = 4,  n = 5
        mat[m][n] = 1 2 3 4 5
                    4 3 1 2 6
                    8 7 6 5 4
                    5 7 8 9 10
Output: 3 '''
n,m=map(int,input().split())
l=[]
for _ in range(n):
    r=list(map(int,input().split()))
    l.append(r)
c=0
for i in l:
    k=sorted(i)
    j=sorted(i,reverse=True)
    if i ==k or i==j:
        c+=1
print(c)