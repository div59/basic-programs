s=input()
x=""
for i in range(0,len(s)):
    if s[i]>='A' and s[i]<='Z':
        print(x)
        x=""
        x=s[i].lower()
    else:
        x+=s[i].upper()
print(x)