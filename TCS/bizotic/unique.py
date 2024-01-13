'''
Write a program to find the count of numbers which consists of unique digits. 
 
Input: 
Input consist of two Integer lower and upper value of an range 
 
Output: 
Output consists of single line, print the count of unique digits in given range. Else Print "No Unique Number" 
 
Solution: 
 
Input - 
10 
15 
'''







def check(num):
    l=[]   
    for i in str(num):
        if i in l:
            return False
        else:
            l.append(i)
    return True 
def unique(lower,upper):
    r=0
    for num in range(lower,upper+1):
        if check(num):
            r+=1
    return r
l1=int(input())
u1=int(input())
res=unique(l1,u1)
if res>0:
    print(res)
else:
    print("No Unique Number")

