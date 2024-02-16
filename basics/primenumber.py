
def isprime(n):
    for i in range(2,int(n**0.5)):
        if n<2:
            return False
        if n%i==0:
            return False
    return True
n=int(input())
res=isprime(n)
if res:
    print("prime")
else:
    print("no")