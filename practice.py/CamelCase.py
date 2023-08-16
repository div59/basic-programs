
s=input()
x=""
for i in s:
    if(i>='A' and i<='Z'):
        print(x)
        x=""
        x+=i.lower()
    else:
        x+=i.upper()
print(x)


