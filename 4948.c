#include<stdio.h>
#include<math.h>
int main(void)
{
	int N; int ct=0;

	START:
		scanf("%d", &N);
		while(N !=0)
		{
			int num[246913] = {1,1,0, };
			ct = 0;
			for(int k=2; k<=2*N; k++)
			{
				if(num[k] == 1)
					continue;
				if(pow(k,2)>2*N) 
					break;
				for(int j=k*k; j<=2*N; j = j+k)
					num[j] = 1;
			}
			for(int i=N+1; i<= 2*N; i++)
			{
				if(num[i] == 0)
				{
					ct++;
				}
					
			}
			printf("%d\n",ct);
			goto START;
		}
	
	return 0;
}
