#include <cstdio>
#include <queue>
#define MAX 1<<20

char rbuf[MAX];
char wbuf[MAX];
int idx, nidx, widx;

inline char read() {
    if(idx == nidx){
        nidx = fread(rbuf, 1, MAX, stdin);
        if(!nidx) return 0;
        idx = 0;
    }
    return rbuf[idx++];
}

inline int readInt() {
    int sum = 0;
    char now = read();
    bool flg = false;
    
    while(now <= 32) now = read();
    if(now == 45) flg = true, now = read();
    while(now >= 48) sum = sum * 10 + now - '0', now = read();
    
    return flg ? -sum : sum;
}

int main(void) {
    int N = readInt(), K = readInt();
    
    std::queue<int> q;
    int maxSum = 0;
    int tmp = 0;
    int num;
    for(int i = 0; i<N; i++) {
        num = readInt();
        q.push(num);
        if(i < K) {
            maxSum += num;
            tmp = maxSum;
        }
        else{
            tmp -= q.front();
            q.pop();
            tmp += num;
        }
        if(tmp > maxSum) 
                maxSum = tmp;
    }
    printf("%d", maxSum);
}
