'''n=8
a=2
d=5
Output: 124
Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124
General Form of AP	a, a + d, a + 2d, a + 3d, . . .
The nth term of AP	an = a + (n – 1) × d
Sum of n terms in AP	S = n/2[2a + (n − 1) × d]
'''
n=int(input())
a=int(input())
d=int(input())
n1=int(n/2)
print(n1*(2*a+(n-1)*d))





