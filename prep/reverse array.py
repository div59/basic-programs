l=list(map(int,input().split()))
l=l[::-1]
print(l)

for i in range(len(l)-1,-1,-1):
    print(l[i],end=" ")