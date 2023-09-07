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
    s->show();
    // base b;
    base* p =&d;
    // p=&b;
    p->show();
    (*p).show();
    // type casting
    ((derived*) p)->show();
    d.show();
    ((derived*) p)->great();
    
}










