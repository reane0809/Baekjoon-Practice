#include <iostream>
#define endl '\n'
using namespace std;
 
const int sz=5e2+1;
int mn,m,mat[sz][2],memo[sz][sz];
 
int solve(int s,int e) {
    int ret=0;
    if(s==e)
        return 0;
    if(memo[s][e])
        return memo[s][e];
    if(e==s+1){
        ret=mat[s][0]*mat[s][1]*mat[e][1];
        memo[s][e]=ret;
        return memo[s][e];
    }
    for(int i=s;i<e;++i) {
        ret=solve(s,i)+solve(i+1,e)+mat[s][0]*mat[i][1]*mat[e][1];
        if(!memo[s][e]||ret<memo[s][e])
            memo[s][e]=ret;
    }
    return memo[s][e];
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);cout.tie(NULL);
 
    cin>>m;
    for(int i=0;i<m;++i)
        cin>>mat[i][0]>>mat[i][1];
    mn=solve(0,m-1);
    cout<<mn<<endl;
    return 0;
}

/*s에서 시작하여 e까지 루프를 돌면서 
서로 다른 모든 순서로 연산되는 행렬 곱셈 횟수를 파악하고 
그중의 최솟값을 취하여 기록해두고 리턴한다. 
모든 경우의 수를 탐색하여 최소값을 갱신 후 리턴하므로 
리턴값은 항상 최소 횟수임이 보장된다.*/
