/*원형 큐에 값을 전부 넣고 K - 1까지의 값을 최후방 삽입.
그렇게 K번째의 수를 탐색 가능하므로 K번째 수를 pop -> 반복수행 */
#include <iostream>
#include <queue>
using namespace std;
 
int main(int argc, char *argv[]) {
	int N, K;
	queue<int> q;
	cin >> N >> K;
 
	for (int i = 1; N >= i; i++) {
		q.push(i);
	}
	
	cout << "<";
	while (!q.empty()) {
		for (int i = 0; i < K - 1; i++) {
			q.push(q.front());
			q.pop();
		}
 
		cout << q.front();
		q.pop();
 
		if (!q.empty()) {
			cout << ", ";
		}
 
	}
	cout << ">" << endl;
 
	return 0;
}

