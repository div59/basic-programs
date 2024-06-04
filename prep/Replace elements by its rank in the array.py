"""Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…
"""
l=list(map(int,input().split()))
l1=l.copy()
l1=set(l1)

l1=list(l1)
l1.sort()
d={}
for i in range(0,len(l1)):
  
    d[l1[i]]=i+1

print(d)
for i in l:
    print(d[i],end=" ")

    




