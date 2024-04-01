''' 
 
Finding the total distance between adjacent items of a list of 5 numbers
Input
input 1 : 5
input 2 : 10 11 7 12 14
Output
12

'''
def findTotalDistance(n,l):
    t=0
    for i in range(n-1):
        t+=(abs(l[i+1]-l[i]))
    return t 
n=int(input())
l=list(map(int,input().split()))
print(findTotalDistance(n,l))

 

