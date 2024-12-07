#include <stdio.h>

int main(){
  int n, x;
  int a[10000],b[10000];
  int i=0;
  scanf("%d %d",&n,&x);
  for(int j=0;j<n;j++){
    scanf("%d",&a[j]);
    if(a[j]<x){
      b[i] = a[j];
      i++;
    }
  }
  for(int k=0;k<i;k++){
    if(k!=i-1){
      printf("%d ",b[k]);
    }else printf("%d",b[i-1]);
  }
}

