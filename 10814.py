import sys
input = sys.stdin.readline

N = int(input())
ans = {str(i): '' for i in range(1,201)}

for _ in range(N):
    age, name = input().split()
    ans[age] += f"{age} {name}\n"

for _, value in ans.items():
    print(value, end='')
