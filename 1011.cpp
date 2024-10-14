#include <iostream>
#include <queue>
using namespace std;

int up_speed(int dis, int&sp,int&count) {
	int sum = 0;
	while (dis-sum>=sum+sp+1) {
		sp++;
		sum += sp;
		count++;
	}
	return sum;
	
}
void find_else(int dis, int&sp, int&count,int reserve) {
	int sum = 0;
	while (1) {
		//같은속도로 진행한지
		while (reserve <=dis - sum) {
			count++;
			sum += sp;
		}
		//낮은 속도로 진행
		reserve -= sp;
		sp--;
		sum += sp;
		if (sp == 0)
			break;
		count++;
		
		
	}
}
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int test;
	cin >> test;
	int x, y;
	for (int i = 0; i < test; i++) {
		cin >> x >> y;
		int speed = 0;
		int time = 0;
		int r=up_speed(y - x, speed,time);
		
		find_else(y - x-r, speed, time,r);
		cout <<time<<"\n";
	}
	
}

