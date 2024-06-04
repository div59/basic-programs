'''Input : N = 74
Output : True . 
Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

Example 2:
Input : N = 11
Output : False. 
Explanation: 11 cannot be expressed as sum of two prime numbers.'''

def isprime(k):
  
    if k<=1:
        return False
    else:
        for i in range(2,(int(k**0.5)+1)):
            if k%i==0:
                return False
        return True
                
    
n=int(input())
j=0
for i in range(2,n+1):
    g=n-i
    if isprime(g) and isprime(i):
        print(g,i)
        j=1
        break
    
if j==1:
    print("yes")
else:
    print("no")