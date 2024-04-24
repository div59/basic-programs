def isprime(k):
    f=0
    for i in range(2,int(pow(k,0.5))+1):
        if k%i==0:
            f=1
            return 1
    

n=int(input())
# m=int(input())
l=[]
for i in range(2,n+1):
    if n%i==0:
        if isprime(i)!=1:
            l.append(i)
print(l)
    
        

