#include <stdio.h> 
#include <algorithm> 
using namespace std; 
int a[333]; 
int n; 
int d[333]; 
int main(void) {
    
	scanf("%d", &n); 
    
	for (int i=1; i<=n; i++) scanf("%d", &a[i]); 
	    d[1]=a[1], d[2]=a[1]+a[2];
    
	for (int i=3; i<=n; i++) 
		d[i] = max(d[i-2]+a[i], a[i]+a[i-1]+d[i-3]);
	
	printf("%d\n", d[n]);
	return false;
}
