n=int(input())
n=str(n)
while(n!=n[::-1]):
    n=int(n)+int(n[::-1])
    n=str(n)
print(n)

    
