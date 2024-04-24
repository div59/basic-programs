n=int(input())
s=str(n)
su=0
for i in s:
    i=int(i)
    su+=i
if n%su==0:
    print("yes")
else:
    print("no")