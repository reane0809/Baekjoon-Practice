#include <iostream>
#include <set>
using namespace std;
set<int> a;
int n, m;

int main() {
    scanf(" %d %d", &n, &m);
    for (int i = 0; i < n; i++) {
        int x; scanf(" %d", &x);
        a.insert(x);
    }
    for (int i = 0; i < m; i++) {
        int x; scanf(" %d", &x);
        if (a.count(x)) a.erase(x);
        else a.insert(x);
    }
    printf("%d\n", a.size());
}
