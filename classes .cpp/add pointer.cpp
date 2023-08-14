// C++ program to illustrate Pointers
  
#include <bits/stdc++.h>
using namespace std;
void add()
{
    int var = 20,a=80;
  
    // declare pointer variable
    int* ptr;
    ptr=&var;
    int* ptr1=&a;
    cout<<"sum is "<<""<<(*ptr+*ptr1)<<endl;;//a+var;
    cout<<"adreess of var"<<ptr<<endl;//&var
    cout<<"adreess of var"<<ptr1<<endl;//&a
    cout<<"content of var"<<*ptr<<endl;
    cout<<"content of a"<<*ptr1<<endl;
    
}
// Driver program
int main() 
{ 
  add(); 
  return 0;
}

