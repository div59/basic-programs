'''

Search an Element in an Array
Example 1:
Input: array[] = {1,2,3,4,5} k=3                                  
Output: 2                                   
Explanation: The answer is 2 because 3 is present at 2nd index.
'''
l=list(map(int,input().split()))
k=int(input())
for i in range(len(l)):
    if l[i]==k:
        print(i)
        break
    