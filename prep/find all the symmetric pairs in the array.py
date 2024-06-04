n=int(input())
l=[]
k=[]
p=[]
d={}
for _ in range(n):
    x,y=map(int,input().split())
    l.append((x,y))
p=l.copy()
for i in range(len(l)):
    h=tuple(sorted(l[i]))
    
    if h not in d:
        d[h]=1
    else:
        d[h]+=1
for i in d.keys():
    if d[i]==2:
        print(i,end=" ")
        # print(tuple((i[1],i[0])))
        
        

        



    