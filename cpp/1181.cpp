#include<iostream>
#include<stdio.h>
#include<string>
#include<vector>
#include<algorithm>

using namespace std;

int main(void){
    int N;
    scanf("%d",&N);

    vector < vector <string> > book(50);

    int i,j;
    string word;
    for(i=0;i<N;i++){
        cin >> word;
        book[word.length()-1].push_back(word);
    }

    for(i=0;i<50;i++) {
        if(book[i].size()>0){
            sort(book[i].begin(),book[i].end());
            book[i].erase(unique(book[i].begin(),book[i].end()),book[i].end());
            for(j=0;j<book[i].size();j++) cout << book[i][j] << endl;
        }
    }
    return 0;
}
