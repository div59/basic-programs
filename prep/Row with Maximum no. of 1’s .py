"""
Here on this page, we will learn how to Find a Row with Maximum no. of 1’s in Python Language.

Example :

Input :  matrix  =  [ [ 0, 1, 0, 0 ],
                                 [ 1, 0, 0, 1 ],
                                 [ 1, 1, 1, 1 ],
                                 [ 0, 0, 1, 1 ] ]
Output :  3rd Row"""


n,m=map(int,input().split())
l=[]
for i in range(n):
    r=list(map(int,input().split()))
    l.append(r)
l1=[]
for i in range(n):
    k=l[i]
    c=k.count(1)
    l1.append(c)
print(l1)
m=l1[0]
for i in range(1,len(l1)):
    if l1[i]>m:
        m=l1[i]
        g=i
        
print(f" 1's r highest in {g+1}  this row")
    
