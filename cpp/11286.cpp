#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;

int N, x;
priority_queue<int,vector<int>,greater<int>> pq1; // 양수 오름차순 저장
priority_queue<int> pq2; // 음수 내림차순 저장

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> x;
		if (x == 0) {
			// 둘다 비어있다면
			if (pq1.empty() && pq2.empty()) 
                cout << "0\n";
			else {    // 둘중 하나가 비어있거나 둘다 원소가 있거나
				if (pq1.empty()) {
					cout << pq2.top() << '\n';
					pq2.pop();
				}
				else if (pq2.empty()) {
					cout << pq1.top() << '\n';
					pq1.pop();
				}
				else {
					if (pq1.top() < -pq2.top()) {
						cout << pq1.top() << '\n';
						pq1.pop();
					}
					else {
						cout << pq2.top() << '\n';
						pq2.pop();
					}
				}
			}
		}
		else if (x > 0) { // 양수일 때
			pq1.push(x);
		}
		else { // (x < 0)음수일 때
			pq2.push(x);
		}
	}

}
