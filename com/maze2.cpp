#include<bits/stdc++.h>

using namespace std;
int ans = 1;


bool isValid(vector<vector<bool>>&vis ,vector<vector<char>>board , int row , int col ){

    if(row >= 0 && row < board.size() && col >= 0 && col < board[0].size() && board[row][col] != 'X' && vis[row][col] != true){
        return true;
    }
    return false;
}
void findComman(vector<vector<char>>board , vector<vector<bool>>&vis , int row , int col ){
    vis[row][col] = true;

    int r[] = {-1 , 0 , 1 , 0};
    int c[] = {0 , 1 , 0 , -1};

    queue<pair<int , int>>q;

    q.push({row , col});
    vis[row][col] = true;

    while(!q.empty()){
        pair<int , int>cell = q.front();
        q.pop();
        int x = cell.first;
        int y = cell.second;
        for(int i=0;i<4;i++){
            int mx = x + r[i];
            int my = y + c[i];

            if(isValid(vis , board , mx , my)){
                ans++;
                q.push({mx , my});
                vis[mx][my] = true;
            }
        }
    }

    
}



int main(){
    int n , m;
    cin >> n >> m;
    vector<vector<char>>board;
    for(int i = 0 ; i < n;i++){
        string s;
        cin >> s;
        vector<char>v;
        for(int i = 0 ; i < m;i++){
            v.push_back(s[i]);
        }
        board.push_back(v);
    }

    vector<vector<bool>>vis(n , vector<bool>(m , false) );

    if(board[0][0] == 'X'){
        cout << 0 << endl;
        return 0;
    }
    findComman(board , vis , 0 , 0 );
    cout << ans << endl;

    return 1;
}