import math
l,x=map(int,input().split())
c=0
for i in range(1,l+1):
    for j in range(i,l+1):
        if math.gcd(i,j)==x:
            # print(i,j)
            c+=1
print(c)

