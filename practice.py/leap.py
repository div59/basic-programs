n=int(input())
if (n%4==0 and n%100!=0 or n%400==0 ):
    print("yes its leaf year")
else:
    print("no its not leaf year")
