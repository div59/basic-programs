# Write a code to find non repeating elements in an array.
# 2,3,4,2,3,6,7,8,7
# 4,6,8
def repeat(l):
    d={}
    for i in l:
        if i not in d:
            d[i]=1
        else:
            d[i]+=1

    for i in d.keys():
        if d[i]==1:
            print(i)
l=list(map(int,input().split()))
print(repeat(l))