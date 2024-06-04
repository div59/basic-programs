n,m=map(int,input().split())
l,l2=[],[]
for i in range(n):
    r=list(map(int,input().split()))
    l.append(r)
for i in range(n):
    for j in range(m):
        l2.append(l[i][j])
l2.sort()
print(" ".join(map(str,l2)))