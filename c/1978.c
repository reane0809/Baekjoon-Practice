#include<stdio.h>

int main(void){
    int x,i,j;
    int so[200]; //소수 배열 
    int kja[100];// 내 입력 배열 
    scanf("%d",&x); 
    int k = 0;
    int a = 0;
    for(i=1;i<=1000;i++){
    	
    	for(j=2;j<i;j++){
    		if(i%j==0){
    			break;
			}
			
		}
		if(i==j){
			so[k] = i;
			k++;
		}
	}
	for(i=0;i<200;i++){
		if(so[i]>=997){
			so[i+1] = 2000;
		}
	}
	for(i=0;i<x;i++){
		scanf("%d",&kja[i]);
	}
	for(i=0;i<x;i++){
		for(j=0;j<200;j++){
			if(kja[i]==so[j]){
				a++;
			}
		}
		
	}
	printf("%d",a);
	
	return 0;
}
