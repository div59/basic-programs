from abc import ABC,abstractmethod
class shape(ABC):
    def show(self):
        pass
class circle(shape):
    def show(self):
        print("hiii")
p1=circle()
p1.show()