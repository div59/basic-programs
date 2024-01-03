'''
Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date 

200 -> Value of x i.e. fine

Output :

600  -> total fine collected 
'''
n=int(input())
arr=list(map(int,input().split()))
date=int(input())
x=int(input())
e,o=0,0
for i in arr:
    if i %2==0:
        e+=1
    else:
        o+=1
print(e,o)
if date%2==0:
    print(o*x)
else:
    print(e*x)
