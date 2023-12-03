l=list(map(int,input().split()))
#s=set(l)
#print(s)

'''l2=[]
for i in l:
    if i not in l2:
        l2.append(i)
print(l2)'''
for i in l:
    if l.count(i)>1:
        l.remove(i)
print(l)