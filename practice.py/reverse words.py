'''nput: s = “geeks quiz practice code” 
Output: s = “code practice quiz geeks”

Input: s = “i love programming very much” 
Output: s = “much very programming love i” 

'''
s1=input().split()
l=list(s1)
k=l[::-1]
print(" ".join(k))