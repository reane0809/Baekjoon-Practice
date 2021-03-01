#include<iostream>
#include<string>
#include<string.h>
#include<stdio.h>
using namespace std;
int ch[26];
void clean() {    //글자 나오는지 체크하는 배열 초기화 함수
	for (int i = 0; i < 26; i++) {
		ch[i] = 0;
	}
	return;
}
int main() {
	int nnnum;
	cin >> nnnum;//단어를 몇개 입력받을지
	string a;
	int len;
	int nt_gr;
	int cnt = 0;
	for (int i = 1; i <= nnnum; i++) {
		cin >> a; //문자열인 a를 입력받습니다.
		clean();//배열을 청소합니다
		len = a.size();//a의 길이를 구해줍니다.
		nt_gr = 1;//이게 그룹단어인지를 체크하기 위해 초기화해줍니다.
		for (int j = 0; j < len; j++) {
    
			if (ch[a[j] - 'a'] == 0) {
				ch[a[j] - 'a'] = 1; //체크 배열의 알파벳 번째가 0이라면 1로(나왔다고 표시)
			}
			else if (a[j] != a[j - 1]) {  //이미 1인데 전 알파벳과 다르다면 그룹단어 여부를 0으로 정하고 나감
				nt_gr = 0;
				break;
			}
		}
		cnt += nt_gr;//그룹단어면 그대로 1일것이고, 그룹단어가 아니면 0이므로 +.
	}
	printf("%d", cnt); //cnt를 출력합니다.
	return 0;
}
