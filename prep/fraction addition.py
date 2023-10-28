def gcd(a,b):
    for i in range(1,int(min(a,b))+1):
        if a%i==0 and b%i==0:
            gcd=i
    return gcd


n1,d1=map(int,input().split())
n2,d2=map(int,input().split())
lcm=(d1*d2)//gcd(d1,d2)
sum1=(n1*lcm//d1)+(n2*lcm//d2)
n3=sum1//gcd(sum1,lcm)
lcm=lcm//gcd(sum1,lcm)
print("{} / {}".format(n3,lcm))