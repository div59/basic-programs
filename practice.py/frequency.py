n=input()
n=list(n)
# divyani
d={}
for i in n:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1
print(d)
for i in d.keys():
    print(i,"=",d[i]," ",end=' ')
