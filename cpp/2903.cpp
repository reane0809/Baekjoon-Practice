#include<stdio.h>
int main() {
    
	int a,i;
	int dot=2;
	scanf("%d" ,&a);
    
	for(i=0;i<a;i++) {
		dot=dot*2-1;
	}
	printf("%d",dot*dot);
}
