l=list(map(int,input().split()))
n=len(l)
h=len(l)//2
l.sort()
l1=l[:h]
l2=l[h:n][::-1]
print(l1+l2)