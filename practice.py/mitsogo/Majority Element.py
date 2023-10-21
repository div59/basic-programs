# Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
# Output: 4
# Explanation:
# In the given array, the number 4 appears 5 times, which is more than half of the array size (9/2 = 4.5). Therefore, 4 is the majority element.
# Example 3:
# Input: [1, 2, 3, 4, 5]
# Output: -1
# Explanation:
# [2, 2, 2, 3, 3, 4, 4, 4, 4]
# There is no majority element in this array since no number appears more than half of the array size (5/2 = 2.5).
l=list(map(int,input().split()))
n=len(l)
s=int(n/2)
c=0
d={}

for i in range(1,len(l)):
    k=l[i]
    if k in d:
        d[k]+=1
    else:
        d[k]=1
i=1
for key in d.keys():
    if i==len(d):
        print(-1)
        break
    if d[key]>s:
        print(key)
        break
    i+=1
    

    

