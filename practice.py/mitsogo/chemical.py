
# Let z = x + x (For example, if x="abc" then z="abcabc").
# The chemicals x and y are said to be explosive if we can jumble the characters of string z to get chemical y. Your task is to return the number of pairs of chemicals that are explosive
#  input1:5
# input2: ["hacker", "int", "niitnt", "hackhackerer", "long")
# Output: 2

# input1:3
# input2: {"medium", "easy", "yeasseya"}
# Output: 1


n=int(input())
l=list(map( str,input().split()))
l2=[]
for i in l:
    l2.append(sorted(i))
c=0
print(l2)
for j in (l2):
    print(j)
    print("______")
    k=j+1
    for k in l2:
        print(k)
        if j==k:
            c+=1
print(c)

    