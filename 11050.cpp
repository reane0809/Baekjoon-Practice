#include<iostream>
 
using namespace std;
 
//반복문 사용
int Facto(int num){
    if(num == 0) 
        return 1;
    
    int result = 1;
    
    for(int i=num; i>=1 ; i--){
        result *= i;
    }

    return result;
}
 
 
int main(void){
    
    int n, k;
    cin >> n >> k;
    cout << Facto(n) / (Facto(k) * Facto(n-k));
    
    return 0;    
}

