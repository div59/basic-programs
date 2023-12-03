#include<iostream>
using namespace std;

class parent1{
    public:
    void show(){
        cout<<"i m parent1"<<endl;;
    }
};
class parent2{
    public:
    void show(){
        cout<<"i m parent2"<<endl;;
    }
};
class child:public parent1,public parent2{
    public:
    void show(){
        cout<<"i m child";
    }
};
int main(){
    child c;
    c.parent1 :: show();
    c.parent2 :: show();
    c.show();
    
}


