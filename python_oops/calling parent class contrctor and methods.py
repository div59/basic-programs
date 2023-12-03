class parent:
    def __init__(self,k):
        self.k=k 
    def show(self):
        print(f"i m parent and my value is =  {self.k}")

class child(parent):
    def __init__(self,k,l):
        #super().__init__(k)    #here self is automatically passed
        parent.__init__(self,k)
        self.l=l
    def show(self):
        #super().show()
        parent.show(self)
        print(f"i m in child and my value is = {self.l}")

p=parent(3)
p.show()
c=child(5,7)
c.show()



