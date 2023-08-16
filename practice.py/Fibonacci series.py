# 0 1 1 2 3 5 8
n=int(input("enter"))
f1,f2=0,1
print(f1,end=" ")
print(f2,end=" ")
for i in range(3,n):
    fn=f1+f2
    print(fn,end=" ")
    f1=f2
    f2=fn
