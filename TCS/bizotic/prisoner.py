def saveThePrisoner(n, m, s):
    # Write your code here
    l1=[]
    l2=[]
    l1=list(range(s,n+1))
    print(l1)
    d=abs(m-len(l1))
    for i in range(1,d+1):
        l2.append(i)
    print(l2)
    l=l1+l2
    print(l)
    return l[-1]
n,m,s=map(int,input().split())
print(saveThePrisoner(n, m, s))