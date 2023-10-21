# In an airport, the Airport authority decides to charge a minimum amount to the passengers who are carrying luggage with them. They set a threshold weight value, say, T, if the luggage exceeds the weight threshold you should pay double the base amount. If it is less than or equal to threshold then you have to pay $1

# Sample Input 1
# 4
# 1
# 2
# 3
# 4
# 3
# Sample Output 1
# 5
n=int(input())
w=[]
for i in range(n):
    w.append(int(input()))
t=int(input())
c=0
for j in w:
    c=c+1
    if(j>t):
        c+=1
print(c)

