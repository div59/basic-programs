s=input()
l=[]
for i in s:
    if i.isalpha():
        l.append(i)
for i in l:
    print(i,end='')