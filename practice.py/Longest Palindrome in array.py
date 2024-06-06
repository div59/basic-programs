'''Longest Palindrome in array
Input a[] = {1, 232, 54545, 999991};

Output: 54545

'''
l=list(map(int,input().split()))
l1=[]
l2=[]
for i in l:
    i=str(i)
    k=i[::-1]
    if k==i:
        l1.append(i)
        l2.append(len(i))

m=max(l2)

i=l2.index(m)
print(l1[i])

# 32 121 4334 54545
        