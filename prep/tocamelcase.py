s=input().lower()
l=[]
l.append(s[0].upper())
for i in range(1,len(s)):
    if i%2==0:
        l.append(s[i].upper())
    else:
        l.append(s[i])
for i in l:
    print(i,end="")