
# from collections import Counter

l=list(map(int,input().split()))

# s=Counter(l)
# for i in s.keys():
#     print(i," ",s[i])

d={}
for i in range(len(l)):
    k=l[i]
    if k not in d:
        d[k]=1
    else:
        d[k]+=1
for i in d.keys():
    print(i," ",d[i])
