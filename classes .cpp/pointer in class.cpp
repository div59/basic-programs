
#include <iostream>

using namespace std;
class student{
    public:
    void show(){
        cout<<"yes"<<endl;
    }
    void disp(){
        cout<<"no"<<endl;
    }
};

int main()
{
    student s;
    student* ptr=&s;
    ptr->show();
    // these are all  equivalent
    s.show();
    (*ptr).show();
    
    
    return 0;
}
