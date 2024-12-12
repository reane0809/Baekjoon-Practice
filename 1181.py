import sys
n = int(sys.stdin.readline())
arr = []
for i in range(n):
  arr.append(sys.stdin.readline().strip())
arr = list(set(arr))
arr2 = sorted(sorted(arr), key = lambda x: len(x))
l = len(arr2)
print('\n'.join(arr2))

