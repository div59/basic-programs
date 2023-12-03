#include<bits/stdc++.h>
using namespace std;
struct box{ //here in this we are using struct as keyword
   int a[5]; 

void take(){
    for(int i=0;i<5;i++){
        cin>>a[i];
    }
}
void show() {
    for(int i=0;i<5;i++){
        cout<<a[i]<<" ";
    }
}
};//as we are using obj to call the methods for that encapsulation is needed
int main(){
    box s; // in c++ no need to use struct keyword here
    s.take();
    s.show();
    return 0;
}
/*
#include<bits/stdc++.h>
using namespace std;
class box{ //here in this we are using struct as keyword
   int a[5]; 
public:
void take(){
    for(int i=0;i<5;i++){
        cin>>a[i];
    }
}
void show() {
    for(int i=0;i<5;i++){
        cout<<a[i]<<" ";
    }
}
};//as we are using obj to call the methods for that encapsulation is needed
int main(){
    box s; // in c++ no need to use struct keyword here
    s.take();
    s.show();
    return 0;
}
*/