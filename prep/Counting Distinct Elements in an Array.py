l=list(map(int,input().split()))
d={}
for i in range(len(l)):
    k=l[i]
    if k in d:
        d[k]+=1
    else:
        d[k]=1
print(d)
c=0
for i in d.keys():
    if d[i]>1:
        c+=1
print(c)
    