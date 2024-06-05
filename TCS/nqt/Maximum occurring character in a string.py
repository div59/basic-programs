'''Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them'''
from collections import Counter
s=input()
c=Counter(s)

print(c)
m=0
b=""
for i in c.keys():
    
    if c[i]>m:
        m=c[i]
        b=i
        
    
print(b)

    
