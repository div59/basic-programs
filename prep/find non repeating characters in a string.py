s=input()
l=""
for i in s:
    if s.count(i)==1:
        l+=i
print(",".join(l))