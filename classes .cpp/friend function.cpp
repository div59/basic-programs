#include<iostream>
#include<bits/stdc++.h>
using namespace std;
// a+b
class B;
class A{
    int a,c=5;
    friend void add(A,B);
    public:
    A(int a){
        this->a=a;
    }
    void show(){
        cout<<"a "<<a<<endl;
    }
    // friend can be declared either in private or public
};
class B{
    int b;
    public:
    B(int b){
        this->b=b;
    }
    void show(){
        cout<<"b "<<b<<endl;
    }
    friend void add(A,B); 
    // it says that it gave the permission to add function to access all from class A
};

// non-member of class
void add(A a1,B b1){
    cout<<"sum is :"<<a1.a+b1.b<<endl;
    cout<<"hj"<<a1.c;
}
int main(){
    A a1(3);
    B b1(4);
    add(a1,b1);
    // here using object we r not called the add function 
    // instead we passed objects...using these objects we petches the private members 
    
    
}










