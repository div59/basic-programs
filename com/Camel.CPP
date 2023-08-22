#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    getline(cin, s);
    string x = "";
    
    for (int i = 0; i < s.length(); ++i) {
        if (s[i] >= 'A' && s[i] <= 'Z') {
            cout << x << endl;
            x = "";
            x += tolower(s[i]);
        } else {
            x += toupper(s[i]);
        }
    }
    cout<<x<<endl;
    
    return 0;
}