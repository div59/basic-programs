import math
n=int(input())
temp=n
le=len(str(n))
r=0
while(n!=0):
    d=n%10
    r=r+pow(d,le)
    n=int(n/10)
if(r==temp):
    print("Armstrong Number")
else:
    print("no")
