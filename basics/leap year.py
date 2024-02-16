def leaf(n):
    return (n%4==0 and n%100!=0) or (n%400==0)
n=int(input())
print(leaf(n))

