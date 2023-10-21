#include<bits/stdc++.h>
using namespace std;
// virtual function illustration
class base{
    public:
    //  by default private
    base(){
        cout<<"base cons"<<endl;
    }
     virtual void show(){
        cout<<"i am parent"<<endl;
    }
    void print(){
        cout<<"yes i m parent"<<endl;
    }
};
class derived : public base{ 
    // converts base class's all in to public
    public:
    derived(){
        cout<<"derived cons"<<endl;
    }
    void show(){
        cout<<"i am child"<<endl;
    }
    void print(){
        cout<<"yes i m child"<<endl;
    }
    
};
int main(){
    base b;
    base *bas;
    derived d; 
    // when obj of derived is created it invokes both base and derived class constructer
    derived *der;
    
    // lets start
    // before making virtual
    
    // bas=&b;
    // bas->show(); 
    // base class ptr points to base class obj so virtual not affect bcz no derived .....hence only base method
    
    // der=&d;
    // der->show();
    // only  derived method get invokes
    
    // bas=&d;
    // bas->show();
    // before making virtual it invokes base show as usual
    
    bas=&d;
    bas->show();
    // afet making virtual invokes derived method
    //  virtual affect only between base and derived
    
    
    // der=&b; error
    
    
    return 0;
}


