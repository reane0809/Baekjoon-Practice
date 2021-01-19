#include <stdio.h>

int main(void) {
	int A, B, C, Mul, num;
	int arr[9]={-1,-1,-1,-1,-1,-1,-1,-1,-1}; //Mul을 저장하기 위한 배열 (최대 9자리)

	scanf("%d %d %d", &A, &B, &C);
	Mul = A * B * C;
	
	for (int i = 0 ;i < 9 ; i++) {
		arr[i] = Mul % 10;  //낮은자리 숫자부터 배열에 저장
		Mul /= 10;
		if (Mul == 0)  // Mul이 9자리보다 작은 수이면 그 뒤로는 배열에 저장안함
			break;
	}

	for (int j = 0; j <= 9; j++) {
		num = 0;				//0부터 9까지 각 숫자가 몇 개인지 세기위한 num
		for (int k = 0; k < 9; k++) {
			if (arr[k] == j)
				num++;
		}
		printf("%d\n", num);
	}
	return 0;
}
