'''xample 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No
 it is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.'''

n=int(input())
s=str(n)
r=0
for i in s:
    i=int(i)
    r+=i

if n%r==0:
    print("yes")
else:
    print("NO")








