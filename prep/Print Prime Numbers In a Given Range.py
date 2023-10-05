n1,n2=map(int,input().split())
l=[]
for i in range(n1,n2+1):
    for j in range(i,int(n2/2)+1):
        print(j)
        if(i%j==0):
            break
        else:
            print(i)
            print("_______________")

            l.append(i)
print(l)