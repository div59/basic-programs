#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n][n];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cin>>a[i][j];
            
        }
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int d=a[i][j];
            while(d%5!=0){
                d++;
            }
            a[i][j]=d;
            
        }
    }
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cout<<a[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}