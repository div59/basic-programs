
#include <iostream>

using namespace std;
class student{
    public:
    int roll;
    student(){
        // not necessary 
    }
    student(int rollnum){
        roll=rollnum;
    }
    student(student &obj){
        roll=obj.roll;
    }
    void disp(){
        cout<<"roll number is"<<""<<roll<<endl;
    }
    
};

int main()
{
    student s1(9);
    s1.disp();
    student s2(s1);
    s2.disp();

    return 0;
}
