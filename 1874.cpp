#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 100000
 
char result[SIZE * 2];
int stack[SIZE];
int top = -1;
 
int main() {
    int n;
    scanf("%d", &n);

    int* arr = (int*)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);    //목표 수열 입력
 
    int num = 1;
    int idx = 0, result_idx = 0;
    
    while (1) {
        if (top == -1 || stack[top] < arr[idx]) {    //스택에 있는 수가 목표 수 보다 낮은 경우
            stack[++top] = num++;                    //push(+)
            result[result_idx++] = '+';
        }
        else if (stack[top] == arr[idx]) {    //스택 상단부분의 수가 목표 수와 같은 경우
            top--;                            //pop(-)
            result[result_idx++] = '-';
            idx++;
        }
        else {                 //스택의 상단부분의 수가 목표 수 보다 높은경우
            printf("NO\n");    //원하는 수열 불가능
            return 0;
        }
        if (result_idx == n * 2) break;
    }
    
    for (int i = 0; i < result_idx; i++)    //결과
        printf("%c\n", result[i]);
 
    return 0;
}
