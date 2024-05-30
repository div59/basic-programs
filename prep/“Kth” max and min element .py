n=int(input())
l=list(map(int,input().split()))
l.sort()
print(f'min is {l[n-1]}')
print(f'max is {l[-n]}')

