m=int(input())
y=int(input())
if(m==2 and y%4==0 and y%400==0 or y%100==0):
    print("29")
elif(m==2):
    print("28")
elif(m==1 or m==3 or m==5 or m==7 or m==8 or 10 or m==12):
    print("31")
else:
    print("30")