
'''Input: s=”this is an amazing program”
Output: “program amazing an is this”
'''

s=input().split()
for i in range(len(s)-1,-1,-1):
    print(s[i],end=" ")
    
