'''
 Sn = a(r^n - 1) / (r - 1) 
Input: a=1 , r=0.5 , n=3
Output: 1.75
Explanation: The sum of given GP Series is 1.75'''
a=float(input())
r=float(input())
n=int(input())
g=(r**n)-1
s=r-1
print(a*(g)/s)

