def Fibnocci(n):
    f1,f2=0,1
    print(f1,end=" ")
    print(f2,end=" ")
    for i in range(2,n):
        f3=f1+f2
        print(f3,end=" ")
        f1=f2
        f2=f3
n=int(input())
Fibnocci(n)
    