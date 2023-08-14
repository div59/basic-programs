# Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

# Test Cases:

# TestCase 1:
# Input :
# 10 , 80
# Expected Result:
# 11 , 22 , 33 , 44 , 55 , 66 , 77.

# Test Case 2:
# Input:
# 100,200
# Expected Result:
# 101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.


# n,m=map(int,input().split())
# l=[]
# for i in range(n,m):
#     s=0
#     temp=i
#     while(i!=0):
#         d=i%10
#         s=s*10+d
#         i=int(i/10)
    
#     if(temp==s):
#         l.append(temp)

# for k in l:
#     print(k,end=" ")


# or
n,m=map(int,input().split())
for i in range(n+1,m):
    s=str(i)
    if s==s[::-1]:
        print(s,end=" ")

   