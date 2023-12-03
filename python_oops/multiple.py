class Parent1:
    def show(self):
        print("Show method from Parent1")

class Parent2:
    def show(self):
        print("Show method from Parent2")

class Child(Parent1, Parent2):
   def show(self):
       Parent1.show(self)
       print("i m in child")

# Create an object of the Child class
child_obj = Child()
child_obj.show()

# Access the show method from Parent1 (leftmost in the class definition)
Parent1.show(child_obj)

# Access the show method from Parent2
Parent2.show(child_obj)
