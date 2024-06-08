'''set1= {1,2,3,4}  and  set2={5,6,7,8}
intersection of set1 and set2 is = { } . So this is disjoint.

set1 ={1,2,3,4}  and  set2={4,5,6,7}

intersection of set1 and set2 = {4} . So this is not disjoint'''
s1=list(map(int,input().split()))
s2=list(map(int,input().split()))
j=0
for i in s1:
    if i  in s2:
        j=1 
        break
if j==1:
    print("no")
else:
    print("yes")
        