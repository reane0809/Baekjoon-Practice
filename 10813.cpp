#include <cstdio>
int main(){
	int N,M;
	int ball[101];
	for(int i=0;i<101;i++)
		ball[i]=i;
	scanf("%d%d",&N,&M);
	for(int i=0;i<M;i++){
		int a,b;
		scanf("%d%d",&a,&b);
		int temp=ball[a];
		ball[a]=ball[b];
		ball[b]=temp;
	}
	for(int i=1;i<=N;i++)
		printf("%d ",ball[i]);
	return 0;
}
