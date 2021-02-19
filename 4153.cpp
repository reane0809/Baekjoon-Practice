#include <iostream>
#include <algorithm>
#include <list>
using namespace std;

int main() {
    
	int temp[3];
	for (int i = 0; i < 3; i++)
		cin >> temp[i];
	list<int> result;

	while (temp[0] != 0 && temp[1] != 0 && temp[2] != 0) {
		sort(temp, temp + 3);
		if (temp[2]*temp[2]==temp[0]*temp[0]+temp[1]*temp[1])
			result.push_back(1);
		else
			result.push_back(0);

		for (int i = 0; i < 3; i++)
			cin >> temp[i];
	}
	for (auto iter = result.begin(); iter != result.end(); iter++) {
		if (*iter == 0)
			cout << "wrong" << endl;
		else
			cout << "right" << endl;
	}
}
