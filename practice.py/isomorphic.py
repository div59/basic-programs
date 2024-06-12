'''Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

Input:  str1 = “aab”, str2 = “xyz”
Output: False
Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has ‘y’.
Suppose, string1 is ABACB and string2 is XPZ. Now map string1 to string2.
Replace A -> X, B -> P, A -> X, C -> Z, B -> P. 
Hence, we observe that string1 and string2 are isomorphic to each other.'''
s1=input()
s2=input()
l=[]
l1=[]
c=0
d=0
for i in s1:
    if i not in l:
        l.append(i)
        c+=1
for j in s2:
    if j not in l1:
        l1.append(j)
        d+=1 
# print(c)
# print(d)
        
if c==d:
    print("yes")
else:
    print("no")
        
        
        
        
        
        
        
        
        
        
        