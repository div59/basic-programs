s=input()
l=[]
for i in s:
    if  i.isdigit():
        l.append(int(i))

ans=sum(l)
print(ans)
