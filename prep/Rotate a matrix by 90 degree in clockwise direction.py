n,m=map(int,input().split())
l,l2=[],[]
a=[]
d=[]

for i in range(n):
    r=list(map(int,input().split()))
    l.append(r)
for _ in range(n):
    r=[0]*m 
    a.append(r)

for i in range(n):
    for j in range(m):
        a[j][i]=l[i][j]
for i in a:
#   d.append(i[::-1])
    i.reverse()
for i in a:
    print(" ".join(map(str,i)))
