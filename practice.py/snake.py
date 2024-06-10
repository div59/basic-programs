''' 
4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50
Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32 
'''
n=int(input())
l=[]
l1=[]
for _ in range(n):
    r=list(map(int,input().split()))
    l.append(r)

l1.insert(0,l[0])
for i in range(1,len(l)):
    if i%2!=0:
        # k=l[i][::-1]
        k=l[i]
        g=k[::-1]
        l1.append(g)
    else:
        l1.append(l[i])
for i in range(n):
    for j in range(n):
        print(l1[i][j],end=" ")
    

