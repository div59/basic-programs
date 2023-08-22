n=int(input())
n=str(n)
d={}
for i in n:
    if i in d:
        d[i]+=1
    else:
        d[i]=1
c=0
for k in d.keys():
    if d[k]!=1:
        c+=1
print(c)