#include <iostream>
#include <cmath>
using namespace std;
 
int main(){
    
    string N;
    int B;
    cin >> N >> B;
    
    int len = (int)N.length();
    int bit = len-1;
    
    int ans = 0;
    
    for(int i = 0; i<len; i++){
        
        char c = N[i];
        int num = 0;
        
        if(65<=c && c<=90) num = c - 55;    //'A' ~ 'Z'
        else num = c - '0';//'0' ~ '9'
        
        ans += num * pow(B, bit-i);
        
    }
    cout << ans;
\
    return 0;
}
