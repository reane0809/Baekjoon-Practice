import sys

N = int(input())
A = list(map(int, sys.stdin.readline().split()))

memo = [A[0]]
cnt = 1

for i in range(1, N):
    if memo[-1] < A[i]:
        memo.append(A[i])
        cnt += 1
    else:
        left = 0
        right = len(memo) - 1
        answer = 0
        while left <= right:
            mid = (left + right) // 2
            if memo[mid] >= A[i]:
                answer = mid
                right = mid - 1
            else:
                left = mid + 1
        #print(answer)
        memo[answer] = A[i]

print(cnt)
