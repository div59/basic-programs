'''Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words'''
from collections import Counter
s=input().split()
s1=s.copy()
l=[]
m=1
for i in s:
    c=Counter(i)
    # print(c,end=" ")
    for j in c.keys():
        if c[j]>m:
            m=c[j]
    l.append(m)
m1=max(l)
if m1>1:
    g=l.index(m1)
    print(s1[g])
else:
    print("-1")
   

        
        

      
        
