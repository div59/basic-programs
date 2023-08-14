# def gcd(a,b):
#     if b==0:
#         return a
#     else:
#         return gcd(b,a%b)
# a,b=map(int,input().split())
# print(gcd(a,b))
import math
a,b=map(int,input().split())
print(math.gcd(a,b))
