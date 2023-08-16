k=input()
n=int(input())
l=list(map(str,input().split()))
ans=[]
for i in l:
    ans.append(i.count(k))
print(ans)