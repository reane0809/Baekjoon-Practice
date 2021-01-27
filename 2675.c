#include<stdio.h>

int main() {

	int i, j, k, l, p;
	char a[21] = {0,};
	
	scanf("%d", &k);

	for(i = 0; i < k; i++) {
		scanf("%d", &l);
		
		scanf("%s", a);
		
		for(j = 0; j < 21; j++) {
    
			if(a[j] == 0)
				break;
			
			for(p = 0; p < l; p++) {
				printf("%c", a[j]);
			}
		
		}
		printf("\n");
	}
}
