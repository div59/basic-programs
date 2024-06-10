
class div:
    def __init__(self,l):
        self.l=l 
        
    def jor(self,k):
        print(k)
        
    def show(self):
        print(f"l is {self.l}")
        
class prith(div):
    def __init__(self,l,h,d):
        super().__init__(l)
        self.h=h
        self.d=d
    def jor(self,k):
        super().jor(k)
        print("yevvvva")
    def show(self):
        div.show(self)
        print(f" h amd d are {self.h} and {self.d}")
a1=div(7)
a1.jor(9)
a1.show()

b1=prith(3,4,5)
b1.jor(8)
b1.show()

