n=int(input())
s1=str(n)
s=n**2
l=len(s1)
s2=str(s)
r=s2[::-1]
r2=r[:l]
ans=r2[::-1]
if s1==ans:
    print("yes")
else:
    print("no")
