c=input()
l=[]
for i in c:
    if i  not in "aeiou":
        l.append(i)
print("".join(l))