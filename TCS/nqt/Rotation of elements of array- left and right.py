'''

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.

'''
n=int(input())
l=list(map(int,input().split()))
k=int(input("enter k :"))
p=input("enter position: ").lower()
j=l.copy()
g=len(l)-k
r,ans,r1,ans1=[],[],[],[]


if p=="left":
    ans1.append(" ".join(map(str,l[k:])))
    r1.append(" ".join(map(str,l[:k])))
print(" ".join(ans1+r1))


if p=="right":
    ans.append(" ".join(map(str,j[-k:])))
    r.append(" ".join(map(str,j[:g])))
print(" ".join(ans+r))
    
    


























