
# a = [
#     [1, 2, 3],
#     [4, 5, 6]
# ]

# b = [
#     [7, 8],
#     [9, 10],
#     [11, 12]
# ]
a=[[1,1,],[2,2]]
b=[[1,1,],[2,2]]
l=[]
arow=len(a)
brow=len(b)
acol=len(a[0])
bcol=len(b[0])

for _ in range(arow):
    c=[0]*bcol
    l.append(c)
for i in range(arow):
    for j in range(bcol):
        for k in range(acol):
            l[i][j]+=a[i][k]*b[k][j]
print(l)







