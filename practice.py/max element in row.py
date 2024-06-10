'''Input :  [1, 2, 3]
         [1, 4, 9]
         [76, 34, 21]

Output :
3
9
76
3 3
1 2 3
1 4 9
76 34 21
'''
n,m=map(int,input().split())
l=[]
for _ in range(n):
    r=list(map(int,input().split()))
    l.append(r)

for i in l:
    m=max(i)
    print(m)