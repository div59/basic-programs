
#include <iostream>

using namespace std;
class student{
    private:
        string name;
    public:
    // student(string na){
    //     name=na;
    //     cout<<"name is"<<" "<<name<<endl;;
    // }
    student(string na);
    
};
    student :: student(string na){
        name=na;
        cout<<"name is"<<" "<<name<<endl;;
     }
 

int main()
{
    student s1("divya"),s2("pritham");
    

    return 0;
}
