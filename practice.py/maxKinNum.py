# k=2
# n=4
# 234 322 222 345
# output 222

k=int(input())
n=int(input())
l2=[]
l=[]
l=list(map(int,input().split()))

for i in l:
    c=0
    while(i!=0):
        
        d=i%10
        if(d==k):
            c+=1
        i=int(i/10)
    l2.append(c)
# print(l2)
max=-1
index=0
for i in range(len(l2)):
    if(l2[i]>max):
        max=l2[i]
        index=i
# print(index)
print(l[index])



    

