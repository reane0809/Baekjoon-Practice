import sys
sys.setrecursionlimit(10**6)

num = int(input())

stair_list = [0 for i in range(0,301)]
dp = [0 for i in range(0,301)]

for idx in range(num):
    stair_list[idx] = int(input())

dp[0] = stair_list[0]
dp[1] = stair_list[0]+stair_list[1]
dp[2] = max(stair_list[0]+stair_list[2],stair_list[1]+stair_list[2])


for i in range(3,num):
    dp[i] = max(dp[i-3]+stair_list[i-1]+stair_list[i],dp[i-2]+stair_list[i])
    
print(dp[num-1])
