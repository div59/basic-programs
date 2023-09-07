s=input()
d={}
for i in s:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1
for i in d.keys():
    if d[i]!=1:
        print(i,end='')
        print(d[i],end='')
    elif d[i]==1:
        print(i,end='')
