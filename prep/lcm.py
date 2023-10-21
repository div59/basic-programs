n1,n2=map(int,input().split())
lcm=1
for i in range(max(n1,n2),n1*n2+1):
    if(i%n1==0 and i%n2==0):
        lcm=i
        break
print(lcm)