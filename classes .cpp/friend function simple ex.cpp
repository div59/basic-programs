
#include <iostream>

using namespace std;
class simple{
    int a=5;
    // int a;
    // public:
    // simple(int aa){
    //     a=aa;
    // }
    friend void show(simple);
};

void show(simple s){
    cout<<"the member of simple class a's value is: "<<s.a<<endl;
}
int main(){
    // simple s(4);
    simple s;
    show(s);
}