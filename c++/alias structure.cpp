
#include<bits/stdc++.h>
using namespace std;
struct box{
   int a[5]; 
};


void take(box &m){
    for(int i=0;i<5;i++){
        cin>>m.a[i];
    }
}
void show(box &m){
    for(int i=0;i<5;i++){
        cout<<m.a[i]<<" ";
    }
}
int main(){
    box s;
    take(s); // we not calling using object instead we are passing object so using this variable we do all stuffs
    show(s);
    return 0;
}