#include <bits/stdc++.h>

using namespace std;
int solve(string s)
{
    unordered_map<char, int> m;

    int n = s.size();

    m['A'] = 1;
    m['B'] = 2;
    m['C'] = 3;
    m['D'] = 4;
    m['E'] = 5;

    if (n == 1)
    {
        return m[s[0]];
    }

    int ct = 5;
    for (char i = 'A'; i <= 'E'; i++)
    {
        for (char j = 'A'; j <= 'E'; j++)
        {
            ct++;
            string res = "";
            res.push_back(i);
            res.push_back(j);
            if (res == s)
            {
                return ct;
            }
        }
    }
    return -1;
}
int main()
{

    string s;
    cin >> s;
    int ans = solve(s);
    cout << ans;
    return 0;
}