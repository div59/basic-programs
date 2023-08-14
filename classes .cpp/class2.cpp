
#include <iostream>

using namespace std;
class student{

    public:
        
        void display(int roll,string name){
            cout<<"name"<<" "<<name<<" "<<"and roll number is"<<" "<<roll<<endl;
        }
        
};

int main()
{
   student s1;
   s1.display(9,"divya");
   
    return 0;
}

