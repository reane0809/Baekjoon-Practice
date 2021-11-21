import sys
r = sys.stdin.readline
from collections import Counter
_, c, _ = r(), Counter(r().split()), r()
print(' '.join(str(c[m]) if m in c else '0' for m in r().split()))
