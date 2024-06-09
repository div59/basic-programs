'''Input: string1 = “amazon”, string2 = “azonam” 
Output: Yes 
Explanation: Rotating string1 by 2 places in anti-clockwise gives the string2.

Input: string1 = “amazon”, string2 = “onamaz” 
Output: Yes 
Explanation: Rotating string1 by 2 places in clockwise gives the string2.'''

s1=input()
s2=input()
k=s1[2:]
j=s1[:2]
l=k+j
if l==s2:
    print("yes")
else:
    print("no")