"""We are required to create a simplified expression by removing brackets from the expressions entered by the user.

Example 1
Input is as follows:(x+y)+(z+q)

String without bracket is: x+y+z+q

Example 2
Input is as follows: (x-y+z)-p+q

String without bracket is: x-y+z-p+q

Example 3
Input is as follows: (a-b)+[c*d]+{e/f}
String without bracket is a-b+c*d+e/f
"""
i=input()
l=[]
for s in i:
    if s!='{' and  s!='}' and s!='[' and s!=']' and  s!='(' and s!=')':
        l.append(s)
for i in l:
    print(i,end='')
