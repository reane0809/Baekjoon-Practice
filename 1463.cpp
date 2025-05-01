//top-down

#include <iostream>
using namespace std;

int arr[1000001];

int lesss(int a, int b){
    if(a<b) return a;
    else return b;
}

int solve(int n){
    int min = 1000001;
    if(n==1){
        arr[1] = 0;
        return 0;
    }
    else if(n==2){
        arr[2] = 1;
        return 1;
    }
    if(arr[n] > -1) return arr[n];
    else{
        if(n%3==0){
            min = lesss(min, solve(n/3) + 1);
        }
        if(n%2==0){
            min = lesss(min, solve(n/2) + 1);
        }
        min = lesss(min, solve(n-1) + 1);
        arr[n] = min;
        return arr[n];
    }
}

int main(){
    int n;
    cin >> n;
    fill_n(arr,1000001,-1);
    cout << solve(n);
    return 0;
}

