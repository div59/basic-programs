def toString(a):
    return "".join(a)


def permute(a,l,n):
    if l==n:
        print(toString(a))
    for i in range(l,n):
        a[l],a[i]=a[i],a[l]
        permute(a,l+1,n)
        a[l],a[i]=a[i],a[l]
S=input()
a=list(S)
n=len(S)
permute(a,0,n)