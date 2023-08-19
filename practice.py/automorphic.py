n=int(input())
#25 pow(25,2) 625
sqared=pow(n,2)
n=str(n)
l=len(n)

sqared=str(sqared)
rev=sqared[::-1]
ans=""
for i in range(l):
    ans+=rev[i]
ans1=ans[::-1]
if(ans1==n):
    print("yes")
else:
    print("no")
