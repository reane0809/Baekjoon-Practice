#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int count;
	char numarr[101];
	int sum = 0;
	int buf = 0;
	scanf("%d", &count);
	
	scanf("%s", numarr);

	for (int i = 0; i < count; i++)
	{
		buf = numarr[i] - '0'; // 이 부분을 buf = atoi(numarr[i]);로 하니깐 안됨
		sum += buf; 
	}

	printf("%d", sum);
	

	return 0;
}

