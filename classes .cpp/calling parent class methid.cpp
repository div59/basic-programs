
#include <iostream>

using namespace std;
class parent{
    public:
    void show(int);
    
};
 void parent :: show(int k){
     cout<<"yes  "<<k<<endl;
 }
 class derived:public parent{
     public:
     void show(int k,string s){
         parent ::show(k);//look at this
         cout<<"no "<<s<<endl;
     }
    
 };

int main()
{
    parent ob,ob2;
    parent* p;
    derived obb;
    ob.show(7);
    ob2.show(8);
    obb.show(5,"divya");
    p->show(12);
    (*p).show(12);
    ((derived*)p)->show(34,"kumbar");

    return 0;
}