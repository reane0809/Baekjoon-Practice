#include <iostream>
using namespace std;

int main() {
	
	int T = 0;
	int A = 0;
	int B = 0;
	cin >> T;


	for (int i = 1; i <= T; i++) {

		cin >> A >> B;
		if (A < 0) {
			A = 0;
		}
		else;
		if (B > 10) {
			B = 10;
		}
		else;


		cout << "Case #" << i << ": " << A + B <<endl;

	}
}
