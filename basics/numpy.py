import numpy as np 

x=np.array([[1,2,3],[4,5,6]])
y=np.array([[1,2,1],[2,1,2]])
print(np.add(x,y))
print(np.subtract(x,y))
print(np.multiply(x,y))
print(np.dot(x,y.T))
print(np.divide(x,y))

