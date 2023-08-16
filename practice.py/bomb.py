l=list(map(int,input().split()))
l.sort()
n=len(l)
for i in range(n):
    print(abs(l[0]*l[n-1]))
    break
   