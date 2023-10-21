n1,n2=map(int,input().split())
hcf=1
for i in range(1,min(n1,n2)):
    if(n1%i==0 and n2%i==0):
        hcf=i
print(hcf)