l=list(map(int,input().split()))
even,odd=0,0
for i in l:
    if i%2==0:
        even+=1
    else:
        odd+=1
print(f"even count is= {even} and ")
print(f" odd count is ={odd}")