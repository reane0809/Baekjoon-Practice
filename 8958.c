#include<stdio.h>
int main(){
    int i=0,t,answer,score;
    char a,k;
    scanf("%d%c",&t,&k);   //입력받을 OX줄 개수 + 첫줄 띄어쓰기 넘기기
    while(i<t){
        score=1;
        answer=0;
        while(scanf("%c",&a)!=EOF){
            if(a=='O'){            
                answer=answer+score;
                score++;
            }
            else if(a=='X'){
                score=1;
            }
            else if(a=='\n'){
                printf("%d\n",answer);
                
                break;
            }

            else  {
                printf("%d\n",answer);
                
                break;
            }
        }
        i++;
       
        

    }
}
