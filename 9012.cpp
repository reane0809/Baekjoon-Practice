#include<iostream>
#include<stack>
#include<string>
 
using namespace std;
 
bool Check(string str){
    int len = (int)str.length(); //문자열 길이
    stack<char> st;              //char 타입을 받는 stack 선언
 
    for(int i=0; i<len ; i++) { //문자열 길이만큼 반복
        char c = str[i];        //문자 하나씩 받기
 
        if(c == '('){
            st.push(str[i]);    //여는 괄호로 push
        }else{
            if(!st.empty()){    //닫는 괄호면 stack 이 비어있는지 확인후
                st.pop();       //스택이 비어있지 않으면 pop으로
            }else{
                return false;   //비어있으면 false로
            }
        }
    }
 
    return st.empty();          //반복문 종료시 스택에 괄호가 잔존하면 false
}
 
int main(void){
 
    int n;
    cin >> n;
 
    for(int i=0; i<n; i++){
        string str;
        cin >> str;
 
        if(Check(str)){
            cout << "YES" << endl;
        }else{
            cout << "NO" << endl;
        }
    }
 
    return 0;
}
