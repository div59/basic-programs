s=input().upper()
c=0
for i in s:
    if i not in "AEIOU":
        c+=1
# print(c)
f=1
for i in range(1,c+1):
    f*=i
print(f)