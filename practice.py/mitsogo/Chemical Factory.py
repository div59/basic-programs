
# Let z = x + x (For example, if x="abc" then z="abcabc").
# The chemicals x and y are said to be explosive if we can jumble the characters of string z to get chemical y. Your task is to return the number of pairs of chemicals that are explosive
#  input1:5
# input2: ["hacker", "int", "niitnt", "hackhackerer", "long")
# Output: 2

# input1:3
# input2: {"medium", "easy", "yeasseya"}
# Output: 1

# def check(l2):
#     c=0
#     for i in range(len(l2)):
#         for j in range(i+1,len(l2)):
#             if explosive(l2[i],l2[j]):
#                 c+=1
#     print(c)

# def explosive(x,y):
#     z=x + x
#     return z==y

# n=int(input())
# l=list(map( str,input().split()))
# l2=[]
# for i in l:
#     l2.append(''.join(sorted(i)))
# check(l2)

def is_explosive(x, y):
    z = x + x
    return sorted(z) == sorted(y)

def count_explosive_pairs(N, chemicals):
    count = 0
    for i in range(N):
        for j in range(i+1, N):
            if is_explosive(chemicals[i], chemicals[j]):
                count += 1
    return count

# Example usage
input1 = 5
input2 = ["hacker", "int", "niitnt", "hackhackerer", "long"]
output = count_explosive_pairs(input1, input2)
print(output)
