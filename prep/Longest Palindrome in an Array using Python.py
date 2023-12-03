l=list(map(int,input().split()))
l2=[]
for i in l:
    s=str(i)
    r=s[::-1]
    if(s==r):
        l2.append(s)
print(l2)

m=l2[0]
for i in range(1,len(l2)):
    if(len(l2[i])>len(m)):
        m=l2[i]
print(m)
# d={}
# print(l2)
# for i in l2:
#     d[i]=len(i)
# print(d)
# max_key = max(d, key=d.get)
# max_value = d[max_key]
# print(max_key)
# print(max_value)



































    
 

