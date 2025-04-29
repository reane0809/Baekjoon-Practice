from itertools import combinations
n = int(input())
arr = []
v = []
ans = 1e9
# 전체팀을 집합으로 구해놓는게 시간상 더 쉽게 구할수 있습니다.
total_team = set(range(0,n))
c_range = [x for x in range(n)]
for _ in range(n):
    arr.append(list(map(int,input().split())))

for team_a in combinations(c_range, n//2):
    # 그리고 team_b는 tuple로 하는 것보다 집합의 차집합을 통해 쉽게 구할수 있습니다.
    team_b = list(total_team - set(team_a))
    sum_a = 0
    sum_b = 0
    # 여기서 시간을 많이 나간것 같습니다.
    # combination 대신 직접 range를 돌리면서 하는게 더 빠를 것 같습니다.
    for index_a in range(n//2):
        for index_b in range(index_a+1,n//2):
            sum_a += arr[team_a[index_a]][team_a[index_b]]+arr[team_a[index_b]][team_a[index_a]]
            sum_b += arr[team_b[index_a]][team_b[index_b]]+arr[team_b[index_b]][team_b[index_a]]
    temp = abs(sum_a-sum_b)
    
    if temp<ans:
        ans = temp
print(ans)

