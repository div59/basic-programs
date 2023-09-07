s=input()
l1=[]
l2=[]
for i in s:
    if i=='#':
        l1.append(i)
    else:
        l2.append(i)
l=l1+l2
for i in l:
    print(i,end="")