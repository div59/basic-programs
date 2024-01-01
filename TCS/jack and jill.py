'''
Jack and Jill are playing a string game. Jack has given Jill two strings A and B. Jill has to derive a string C from A, by deleting elements from string A, such that string C does not contain any element of string B. Jill needs help to do this task. She wants a program to do this as she is lazy. Given strings A and B as input, give string C as Output.

'''
'''
a=input()
b=input()
l2=list(a)
for i in a:
    for j in b:
        if i==j:
            l2.remove(i)
for i in l2:
    print(i,end="")
'''

a=input()
b=input()
c=""
for i in a:
    if i in b:
        continue
    else:
        c+=i
print(c)
