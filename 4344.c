#include <stdio.h>

int main(){
    int c=0;
    int n=0;
    int arr[1000]={0,};
    float mean=0;
    float count=0;
    float percent=0;
    
    scanf("%d",&c);
    
    for(int i=0;i<c;i++){  
        scanf("%d",&n);
        mean=0;
        count=0;
        
        for(int j=0;j<n;j++){ //점수 입력 및 평균구하기
            scanf("%d",arr+j);
            mean=mean+arr[j];
        }
        mean=mean/n;         //점수 입력 및 평균구하기
                        
       
        for(int j=0;j<n;j++){ // 퍼센트 구하기
            if(arr[j]>mean){
                count++;
            }
        }
        percent=(count/n)*100; // 퍼센트 구하기
   
        printf("%.3f%%\n",percent);
        percent=0;
  
    
        }
     }
