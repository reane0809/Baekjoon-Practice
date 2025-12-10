import sys
from collections import Counter


def jwy():
    n, m = map(int, sys.stdin.readline().split())
    woods = Counter(map(int, sys.stdin.read().split())).items()
    s, e = 0, max(woods)[0]
    answer = 0
    while s <= e:
        mid = (s + e) // 2
        if sum([(wood - mid) * c if wood > mid else 0 for wood, c in woods]) >= m:
            answer = mid
            s = mid + 1
        else:
            e = mid - 1
    print(answer)
   

if __name__ == '__main__':
    jwy()

