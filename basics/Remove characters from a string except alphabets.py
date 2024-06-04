s=input()
l=[]
for i in s:
    if i.isalpha():
        l.append(i)
print("".join(l))