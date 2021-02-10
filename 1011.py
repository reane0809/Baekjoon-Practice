from math import sqrt
import sys

read = sys.stdin.readline

num_of_cases = int(read())
for _ in range(num_of_cases):
  curr, dest = [int(x) for x in read().split()]
  distance = dest - curr
  n = int(sqrt(distance))
  count = n * 2
  distance -= n * (n + 1)
  count += distance // n
  count += 0 if distance % n == 0 else 1
  print(count)
