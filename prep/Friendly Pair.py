x,y=map(int,input().split())
l1=[]
l2=[]
for i in range(1,x):
    if x%i==0:
        l1.append(i)
for i in range(1,y):
    if y%i==0:
        l2.append(i)
s1=sum(l1)
s2=sum(l2)
k1=int(x/s1)
k2=int(y/s2)
if(k1==k2):
    print("friend")
else:
    print("no")

