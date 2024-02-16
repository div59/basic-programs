def Armstrong_number(n):
    s=str(n)
    l=len(s)
    res=0
    for i in s:
        i=int(i)
        res+=i**l
    return res
n=int(input())
ress=Armstrong_number(n)
if n==ress:
    print("yes")
else:
    print("no")


