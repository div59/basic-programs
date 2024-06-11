arr = [[ 1, 0, 3 ],[ 2, 5, 6 ],[ 9, 4, 8 ]] ; 
n=3

a=[]
s=[]

v=0
for i in range(n):
    for j in range(n):
        s.append(arr[i][j])
s.sort()

for i in range(n):
    for j in range(n):
        arr[i][j]=s[v]
        v+=1
    
for i in range(n):
    for j in range(n):
        print(arr[i][j],end=" ")
    print()

        