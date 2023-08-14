
#include <iostream>

using namespace std;
class student{
    private:
        int roll;
        string name;
    public:
        void assign(int roll,string name){
            this->roll=roll;
            this->name=name;
        }
        void display(){
            cout<<"name"<<" "<<name<<" "<<"and roll number is"<<" "<<roll<<endl;
        }
        
};

int main()
{
   student s1;
   s1.assign(9,"divya");
   s1.display();

    return 0;
}
