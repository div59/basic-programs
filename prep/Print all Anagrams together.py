words = [ "cat", "dog", "tac", "god", "act", "z" ]
d={}
for i in words:
    k="".join(sorted(i))
    if k not in d:
        d[k]=[]
    d[k].append(i)
print(d)
for i in d.values():
    print(" ".join(i))
# for i in d.keys():
#     print(" ".join(d[i]))