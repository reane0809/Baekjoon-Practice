#include <stdio.h>
int n;
void f(int m,int a,int b){
	if(m){
		f(m-1,a,6-a-b);
		printf("%d %d\n",a,b);
		f(m-1,6-a-b,b);
	}
}
int main(){
	scanf("%d",&n);
	printf("%d\n",(1<<n)-1);
	f(n,1,3);
}
