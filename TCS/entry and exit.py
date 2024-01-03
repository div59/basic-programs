
n=int(input())
e=list(map(int,input().split()))
o=list(map(int,input().split()))
m,sum=0,0
for i in range(n):
    sum=sum+e[i]-o[i]
    m=max(sum,m)
print(m)