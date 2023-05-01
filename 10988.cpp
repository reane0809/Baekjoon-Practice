#include <stdio.h>
#include <string.h>
int main() {
	int i, n;
	char a[105];
	scanf("%s", a);
	n=strlen(a);
	for(i=0;i<n;i++){
		if(a[i]!=a[n-i-1]){
			printf("0");
			return 0;
		}
	}
	printf("1");
}
