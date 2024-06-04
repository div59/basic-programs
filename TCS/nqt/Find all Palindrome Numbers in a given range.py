
'''Input: min = 10 , max = 50
Output: 11 22 33 44 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.'''
n,m=map(int,input().split())
h=[]
for i in range(n,m+1):
    k=str(i)[::-1]
    k=int(k)
    if i==k:
        h.append(i)
print(h)