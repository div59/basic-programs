'''Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza'''

s=input()
n=len(s)
l=[]

for i in range(len(s)-1):
    l.append(s[i+1])
l.append(s[0])

print("".join(l))