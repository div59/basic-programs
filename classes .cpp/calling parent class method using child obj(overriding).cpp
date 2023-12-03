#include <iostream>
using namespace std;

class Parent {
public:
    void GeeksforGeeks_Print() {
        cout << "Base Function" << endl;
    }
};

class Child : public Parent {
public:
    void GeeksforGeeks_Print() {
        cout << "Derived Function" << endl;
    }
};

int main() {
    Child Child_Derived;


    // Call the overridden method of the parent class using the child object
    Child_Derived.Parent::GeeksforGeeks_Print();

    // Call the overridden method of the child class
    Child_Derived.GeeksforGeeks_Print();

    return 0;
}







//in python
/*class Parent:
    def geeks_for_geeks_print(self):
        print("Base Function")

class Child(Parent):
    def geeks_for_geeks_print(self):
        print("Derived Function")

if __name__ == "__main__":
    child_derived = Child()

    # Call the overridden method of the parent class using the parent class explicitly
    Parent.geeks_for_geeks_print(child_derived)
    

    # Call the overridden method of the child class
    child_derived.geeks_for_geeks_print()
*/