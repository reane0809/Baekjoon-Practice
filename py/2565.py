import sys
n = int(input()) #전깃줄 개수
lineNumber = [] ; cross_cnt = [1 for _ in range(n)] ;
for i in range(n):
    lineNumber.append(list(map(int, sys.stdin.readline().strip().split())))
lineNumber.sort()
for i in range(1,n):
    for j in range(i):
        if( lineNumber[j][1] < lineNumber[i][1] and cross_cnt[i] < cross_cnt[j] +1):
            cross_cnt[i] += 1 # 교차 개수 + 1

print(n - max(cross_cnt))
