# s=input()
# s=list(s)
# c,n=0,0
# for i in s:
#     # if  i.isdigit() or i.isalpha() or i==" ":
#     if  i.isdigit() or i.isalpha() or i.isspace():
#         c+=1
#     else:
#         n+=1
# print(n)


# 0r
s=input()
s=list(s)
c=0
for i in s:
    
    if  not  (i.isdigit() or i.isalpha() or i.isspace()):
        c+=1
    
print(c)


