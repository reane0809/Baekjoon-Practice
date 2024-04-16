#include <iostream>
#include <algorithm>
#include <vector>
#include <array>
using namespace std;

bool compare(array<int, 2> &x,array<int, 2> &y) {
  return(x[1] < y[1] || (x[1] == y[1] && x[0] < y[0]));
}

int main() {
  int num; cin >> num;
  array<int, 2> a;
  vector<array<int, 2>> x(num, a);
  for(int i=0;i<num;i++) {scanf("%d %d", &x[i][0], &x[i][1]);}

  sort(x.begin(), x.end(), compare);

  for(int i=0;i<num;i++) printf("%d %d\n", x[i][0], x[i][1]);
}
