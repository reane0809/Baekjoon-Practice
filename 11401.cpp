#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <queue>
#include <utility>
#include <cstdlib>

using namespace std;
	
int main(){	
	
	int n,k; scanf("%d %d",&n,&k);
	if(n/2<k){
		k=n-k;
	}

	int nanoogi=1000000007;
	
	unsigned long long temp1=1;	
	unsigned long long temp2=1;
	for(int i=0;i<k;i++){
		unsigned long long a=n-i;  unsigned long long b=k-i;
		temp1*=(a%nanoogi);	
		temp2*=(b%nanoogi);	
		temp1%=nanoogi;
	temp2%=nanoogi;	
	}
	temp1%=nanoogi;
	temp2%=nanoogi;

	unsigned long long sss[500]={0,};
	
	sss[0]=temp2;
	
	for(int i=1;i<50;i++){
		unsigned long long ttemmp=sss[i-1]*sss[i-1];
		sss[i]=ttemmp%nanoogi;
	}
	
	long long realtemp2=1;
	
	long long tt=nanoogi-2;
	int x=0;
	while(tt){
		if(tt%2==1){
			realtemp2*=sss[x];
			realtemp2%=nanoogi;
		}
		x++;
		tt/=2;
	}
	
	printf("%llu",(realtemp2*temp1)%nanoogi);
	
	return 0;
}

