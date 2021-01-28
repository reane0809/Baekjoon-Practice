#include <iostream>
#include <string>
using namespace std;

int main() {
	string s;
	cin >> s;

	int a[26];	
	fill_n(a, 26, 0);
	for (int i = 0; i < s.size(); i++) {
		if (s[i] < 97) {				//알파벳이 대문자이면
			s[i] += 32;					//소문자로 변환
		}		
		a[s[i] - 97]++;					//알파벳의 아스키코드 - 97의 인덱스에 삽입.
	}

	int biggest = a[0];
	int index = 0;
	bool duplicate = 0;
	for (int i = 1; i < 26; i++) {
		if (biggest < a[i]) {
			biggest = a[i];
			index = i;
			duplicate = 0;
		}
		else if (biggest == a[i] && biggest > 0) {
			duplicate = 1;
		}
	}
	if (duplicate) {				//동일값이 존재할 때
		cout << "?" << endl;
		exit(0);
	}
	cout << (char)(index + 65) << endl;

	return 0;
}
