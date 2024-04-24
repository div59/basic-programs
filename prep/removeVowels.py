s=input().lower()
s1=list(s)
for c in s1:
    if c=="a" or c=="e" or c=="i" or c=="o" or c=="u":
        s1.remove(c)
for i in s1:
    print(i,end="")