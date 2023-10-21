n=int(input())
l=[]
for i in range(1,n):
    if n%i==0:
        l.append(i)
sum=sum(l)
if n<sum:
    print("Abundant Number")
else:
    print("No")
