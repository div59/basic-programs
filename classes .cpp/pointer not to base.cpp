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
    base b;
    // derived* d=&b; 
    // derived class object cant point to base
    // cant d->show();
    derived* d;
    d= (derived*)&b; 
    d->show();
    
    
    
}








