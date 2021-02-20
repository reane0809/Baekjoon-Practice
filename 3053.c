#include <stdio.h>
#include <iostream>

using namespace std;


int main() {

	int num;

	scanf("%d", &num);
	
	printf("%6f\n", num * num * 3.14159265358979);
	printf("%6f", (double)(num * num * 2));

	return 0;

}
