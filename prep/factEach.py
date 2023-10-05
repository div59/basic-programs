n=int(input())
l=[]
s=0
while(n!=0):
    d=n%10
    f=1
    for i in range(1,d+1):
        f=f*i
    l.append(f)
    n=int(n/10)
for i in l:
    s+=i
print(s)