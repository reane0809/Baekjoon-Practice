#시간복잡도 O(NlogN) 추정
import sys
input = lambda: sys.stdin.readline()
N = int(input())
data = list(map(int, input().split()))
dic = {}
for i, num in enumerate(sorted(set(data))):
    dic[num] = i

#튜플 사용
print(" ".join(map(str, (dic[num] for num in data))))
