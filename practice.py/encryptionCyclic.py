# n=int(input())
# k=int(input())
# s=str(n)
# # k= k % len(data)
# print(s[k:]+s[:k])
n=int(input())
k=int(input())
s=str(n)
s=list(s)
print(s)
for i in range(len(s)):
    s[i]=s[k]
    k=k%len(s)
    k+=1
print(s)

        

    


    


