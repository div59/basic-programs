from math import sqrt

n = int(input())
l = list(map(int , input().split()))
ct = 0
for i in l:
    sample = sqrt(i)
    if sample == int(sample):
        ct+=1
print(ct)