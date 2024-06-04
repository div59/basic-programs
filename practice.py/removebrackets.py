s=input()
b="{([])}"
l=[]
for i in s:
    if i not in b:
        l.append(i)    
k="".join(l)
print(k)
