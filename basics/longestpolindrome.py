def longest(s):
    n=len(s)
    l=''
    for i in range(n):
        for j in range(i+1,n+1):
            w=s[i:j]
            if w==w[::-1]:
                if len(w)>=len(l):
                    l=w
    return l

s=input()
print(longest(s))
