'''
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30
'''
n=int(input())
a=list(map(int,input().split()))
k=int(input())
l=[]
# for i in range(n):
#     d=i+k
#     m=d%n
#     l.insert(m,a[i])
# print(l)
for i in range(n):
    m=(i+k)%n
    l.append(a[m])
for i in l:
    print(i,end=" ")