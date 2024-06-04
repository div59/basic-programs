m,n=map(int,input().split(" "))
l=[]
for i in range(n):
    a=list(map(int,input().split(" ")))
    l.append(a)
c=n-1
for i in range(m):
    for j in range(n):
        if(j<=c):
            l[i][j]=0
        else:
            l[i][j] =1
        print(l[i][j],end=" ")
    c-=1
    print()