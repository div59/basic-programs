def gcd(a,b):
    if b==0:
        return a
    return gcd(b,a%b)
def gcdofthree(a,b,c):
    return gcd(gcd(a,b),c)
a,b,c=map(int,input().split())
print(gcd(a,b))
print(gcdofthree(a,b,c))