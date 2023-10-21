#include<iostream>
using namespace std;

class base {
    public:
    void show(){
        cout<<"i m in base class"<<endl;
    }
};

class derived : public base{
    public:
    int a=10;
     void show(){
        cout<<"i m in derived class"<<" "<<a<<endl;
    }
    void great(){
        cout<<"welcome"<<endl;
    }

};
int main(){
    derived d;derived* s;
    s=&d;
    s->show();//i m in derived class 10
    // base b;
    base* p =&d;
    // p=&b;
    p->show();//i m in base class
    (*p).show();//i m in base class
    // type casting
    ((derived*) p)->show();
    d.show();//i m in derived class 10
    ((derived*) p)->great();//welcome
    
}










