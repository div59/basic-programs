n=input()
n=list(n)
# divyani
d={}
for i in n:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1
for i in d.keys():
    print(i,"=",d[i]," ",end=' ')
