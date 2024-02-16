def fact(num):
    f=1
    for i in range(1,num+1):
        f*=i
    return f
n=int(input())
print(fact(n))