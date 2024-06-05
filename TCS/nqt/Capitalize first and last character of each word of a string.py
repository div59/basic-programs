'''Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string'''

s=input().lower()
s=s.split()
l=[]
for i in range(len(s)):
    k=s[i]
    if len(k)==1:
        j=k.upper()
    else:
        j=k[0].upper()+k[1:-1]+k[-1].upper()
    l.append(j)
print(" ".join(l))
    
    