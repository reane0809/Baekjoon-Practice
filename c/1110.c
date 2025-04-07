#include<stdio.h>

int main() {
    int origin,a,b;
	int newone=-1;  
    int cycle=0;
    scanf("%d",&origin);
	a=origin/10;
	b=origin%10;
    while (origin!=newone)
    {	
		int sum=a+b;
		newone=b*10+sum%10;
		a=newone/10;
		b=newone%10;    
		cycle=cycle+1;
	}
    printf("%d",cycle);
    return 0;
}
