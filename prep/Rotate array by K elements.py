"""Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements."""
a=list(map(int,input().split()))
k=int(input())
j,l=[],[]
for i in range(len(a)):
    if i<k:
        l.append(a[i])
    else:
        j.append(a[i])

print(j+l)
