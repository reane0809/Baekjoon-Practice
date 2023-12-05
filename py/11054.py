from bisect import bisect_left as bl
import sys
def solution():
    N=int(sys.stdin.readline())
    arr=list(map(int,sys.stdin.readline().split()))
    arr_R=arr[::-1]

    dp=[]
    dp_R=[]
    lis=[float('-inf')]
    for num in arr:
        if lis[-1] < num:
            lis.append(num)
        else:
            lis[bl(lis, num)] = num
        dp.append(len(lis)-1)

    lis=[float('-inf')]
    for num in arr_R:
        if lis[-1] < num:
            lis.append(num)
        else:
            lis[bl(lis, num)] = num
        dp_R.append(len(lis)-1)

    # 겹치는 값 하나 제거
    print(max(map(lambda x,y: x+y,dp,dp_R[::-1]))-1)

solution()
