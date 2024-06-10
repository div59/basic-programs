'''
3
1 2 3
5 4 6
9 8 7

'''
n=int(input())
l=[]
l1=[]
for _ in range(n):
    r=list(map(int,input().split()))
    l.append(r)
for i in l:
    i.sort()
for i in range(len(l)):
    for j in range(n):
        print(l[i][j],end=" ")
    print(" ")
