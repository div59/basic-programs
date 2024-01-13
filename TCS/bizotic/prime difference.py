'''
There is a range given n and m in which we have to find the count all the prime pairs whose difference is 6. We 
have to find how many sets are there within a given range. 
 
Output: 
Output consists of single line, print the count prime pairs in given range. Else print"No Prime Pairs". 
 
Constraints: 
2<=n<=1000 
n<=m<=2000 
 
Sample Input: 
4 
30 
 
Output: 
6 
 
Explanation: 
(5, 11) (7, 13) (11, 17) (13, 19) (17, 23) (23, 29) . we have 6 prime pairs.
'''
def is_prime(num):
    if num<2:
        return False
    for i in range(2,int(num**0.5)+1):
        if num%i==0:
            return False
    return True
def check(l,u):
    l2=[]
    c=0
    for i in range(l,u+1):
        if is_prime(i):
            l2.append(i)
    for i in l2:
        if i-6 in l2:
            c+=1
    return c


l=int(input())
u=int(input())
res =check(l,u)
if res>0:
    print(res)
else:
    print("No Prime Pairs")

        
