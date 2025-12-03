#include <iostream>
using namespace std;

int n, m;


void dfs(int depth, bool prev[], int list[]) {
    if(depth==m+1) {
        for(int i=1 ; i<=m-1 ; i++) cout << list[i] << " ";
        cout << list[m] << "\n";
    }
    else {
        for(int i=1 ; i<=n ; i++) {
            if(!prev[i]) {
                prev[i]=true;
                list[depth]=i;
                dfs(depth+1, prev, list);
                prev[i]=false;
            }
        }

    }
}

int main() {
    cin >> n >> m;
    int list[m+1];
    bool prev[n+1] = {0, };
    dfs(1, prev, list);
}

