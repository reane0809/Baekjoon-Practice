#include <cstdio>
#include <unistd.h>
#define f(x) {x=0;while(1){if(ptr==buf+sz)syscall(0,0,ptr=buf,sz);if(*ptr<48)break;x=x*10+*ptr++-48;}ptr++;}
#define sz (1<<16)

int main() {
	char buf[sz],*ptr=buf+sz;
	unsigned a[1000000], n, k, l=0, r=0;
	f(n); f(k);
	for(unsigned i=0; i<n; i++) {
		f(a[i]);
		if(r<a[i]) r=a[i];
	}
	while(l+1<r) {
		unsigned m=(l+r)>>1;
		unsigned long t=0;
		for(int j=0; j<n; j++)
			if(a[j]>m)
				t+=a[j]-m;
		(t>=k?l:r)=m;
	}
	printf("%u", l);
}
