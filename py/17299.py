import sys
input = sys.stdin.readline


n = int(input())

nums = list(map(int,input().split()))

count = [0]*1000001

for num in nums: count[num] += 1

def sol():

    stack = []
    answer = []

    for i in range(n-1,-1,-1):
        cur_num = nums[i]

        while stack and count[stack[-1]] <= count[cur_num]: stack.pop()
        answer.append(stack[-1]) if stack else answer.append(-1)

        stack.append(cur_num)

    return reversed(answer)

print(' '.join(map(str,sol())))
