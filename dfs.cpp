#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
map<ll,vector<ll> > l;
vector<int> vis(100001,0);
void add_edge(ll u,ll v)
{
    l[u].push_back(v);
    l[v].push_back(u);
}
ll dfs(ll p,ll d)
{ int tr=0;
    for(auto i:l[p]){
        vis[p]=1;
        if(vis[i]==0){
           
            vis[i]=1;
            //int d1=1+dfs(i,tr);
           d=max( d,1+dfs(i,tr));
        }
    }
    return d;
}

int main(){
    ll n;
    cin>>n;
    n--;
    while(n--){
        ll u,v;
        cin>>u>>v;
        add_edge(u,v);
            //cout<<"in";

    }
    ll z=1;
        ll max=dfs(1,z);
        cout<<max;



}
