#include<stdio.h>

int main() {

	char S[101] = {NULL};
	int count[26] = {0,};
	scanf("%s",&S);
	for(int i='a';i<='z';i++) {
  
		for(int j =0;j<100;j++){
			if(S[j] == i) {
				count[i-97] = j+1;
				break;
			}
			
		}
	}
	for(int i=0;i<26;i++) {
		printf("%d ",count[i]-1);
	}
}

