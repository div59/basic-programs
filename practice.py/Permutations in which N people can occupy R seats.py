'''Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360'''
def ferm(k):
    f=1
    for i in range(1,k+1):
        f*=i
    
    return f
n,r=map(int,input().split())
print(int(ferm(n)/ferm(n-r)))
