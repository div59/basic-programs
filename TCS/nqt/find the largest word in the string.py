'''Input: string s=”Google Doc”
Output: “Google”'''
s=input().split()
s1=s.copy()
g=0
for i in range(len(s1)):
    k=s1[i]
    l=len(k)
    if l>g:
        g=l
        w=k
print(w)
    
    