n=int(input())
s=str(n)
sum=0
for i in s:
    i=int(i)
    sum+=i
if n%sum==0:
    print("hashed number")
else:
    print("no")
