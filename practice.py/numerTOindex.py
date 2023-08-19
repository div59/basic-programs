
# input: arr[] = [100, 5, 70, 2] 
# Output: [4, 2, 3, 1] 
# Explanation: 
# Rank of 2 is 1, 5 is 2, 70 is 3 and 100 is 4.
l=list(map(int,input().split()))
l2=[]
for i in l:
    l2.append(i)
d={}
l.sort()
for  i in range(0,len(l)):
    j=l[i]
    d[j]=i+1
for i in l2:
   if i in d.keys():
        print(d[i],end=" ")

