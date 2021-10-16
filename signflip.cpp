#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        ll n, k;
        cin >> n >> k;
        vector<int> v(n), a(n);
        for (ll i = 0; i < n; i++)
            cin >> v[i];
        a = v;
        sort(a.begin(), a.end());
        ll s = 0;
        for (ll i = 0; i < k; i++)
        {
            if (a[i] < 0)
                s = s + abs(a[i]);
        }
        for (ll i = 0; i < n; i++)
        {
            if (v[i] > 0)
            {
                s = s + v[i];
            }
        }
        cout << s << endl;
    }
    return 0;
}
