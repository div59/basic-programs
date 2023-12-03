l=list(map(int,input().split()))
d={}
for i in range(len(l)):
    k=l[i]
    if k  in d:
        d[k]+=1
    else:
        d[k]=1
l2=[]
for i in d.keys():
    if d[i]>1:
        l2.append(i)
for i in l2:
    print(i,end=" ")