n=int(input())
l=list(map(int,input().split()))
h=[]
p=[]
for i in l:
    if i<0:
        k=abs(i)
        # k=-(i)
        h.append(k)
    else:
        p.append(i)
r1=sum(h)
r2=sum(p)
print(r1+r2)
