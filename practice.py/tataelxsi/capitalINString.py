s=input()
c=input()
s1=""

for i in s:
    if i!=c:
        s1+=i
    else:
        if c.islower():
            s1+=c.upper()
        else:
            s1+=c.lower()
print(s1)
# s=input()
# c=input()
# if c.islower():
#     s=s.replace(c,c.upper())
# else:
#     s=s.replace(c,c.lower())
# print(s)

