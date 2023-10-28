n=int(input())
l2=[]
l=[]
for i in range(2,n):
    f=True
    for j in range(2,i):
        if(i%j==0):
            f=False
            break
    if f:
        l.append(i)
print(l)
for j in range(len(l)):
    for k in range(j+1,len(l)):
        s=sum([l[j],l[k]])
        if(s==n):
            print(l[j],end=" ")
            print(l[k])
            break
        
   




# n = int(input())
# l = []

# for i in range(2, n):
#     is_prime = True
#     for j in range(2, int(i ** 0.5) + 1):
#         if i % j == 0:
#             is_prime = False
#             break
#     if is_prime:
#         l.append(i)

# print(l)
