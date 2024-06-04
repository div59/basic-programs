s=input()
l=[]
for i in s:
    if i not in "(){}[]":
        l.append(i)
print("".join(l))