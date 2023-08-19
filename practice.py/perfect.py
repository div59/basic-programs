n=int(input("enter a number"))
ans=0
for i in range(1,int(n/2)+1):
   if(n%i==0):
        ans+=i
        print(ans)
if(ans==n):
    print("yes")
else:
    print("no")      