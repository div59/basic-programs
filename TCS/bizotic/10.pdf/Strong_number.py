def fact(n):
    f=1
    for i in range(1,n+1):
        f*=i
    return f


def Strong_number(n):
    su=0
    s=str(n)
    for i in s:
        i=int(i)
        su+=fact(i)
    return su
n=int(input())
res=Strong_number(n)
if n==res:
    print("yes")
else:
    print("no")
