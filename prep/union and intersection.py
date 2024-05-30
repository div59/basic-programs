l=list(map(int,input().split()))
l1=list(map(int,input().split()))
print(l+l1)
for i in l:
    if i in l1:
        print(i,end=" ")
