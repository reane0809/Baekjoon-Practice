#include<stdio.h>
#include<math.h>
int main(void){
	long long n;
	long long m;
	long long j;
	int w = 0, y = 0;
	scanf("%d", &m);
	scanf("%d", &n);
	for (long long i = m; i <= n; i++){
		if (i == 2){
			printf("%d\n", i);
		}
		else
		if (i % 2 != 0){
			if (i != 1){
				if (i <= 10){
					if (i == 2 || i == 3 || i == 5 || i == 7){
						printf("%d\n", i);
					}
				}
				else{
					w = (int)sqrt(i);
					y = sqrt(i);
					if (w != y){
						w++;
					}
					for (j = 2; j <= w; j++){
						if (i % j == 0){
							break;
						}
					}
					if (j == w+1){
						printf("%d\n", i);
					}
				}
			}
		}
	}
}
//에라스토테네스의 체x
