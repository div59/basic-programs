#include<bits/stdc++.h>
#include <iostream>

using namespace std;

int main()
{
    string s;
    cin>>s;
    string x="";
    for(int i=0;i<s.length();i++){
        // s[i];
        if(s[i]>='A' and s[i]<='Z'){
            cout<<x<<endl;
            x="";
            x+=tolower(s[i]);
        }
        else{
            x+=toupper(s[i]);
        }
    }
    cout<<x;

    return 0;
}