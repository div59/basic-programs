l=list(map(int,input().split()))
n=len(l)
print(n)
h=len(l)//2
print(h)
l.sort()
l1=l[:h]
l2=l[h:n][::-1]
print(l1+l2)