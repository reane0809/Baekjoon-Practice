n = int(input())
s = list(map(int, input().split()))

max_num = max(s)
result = 0

for i in range(n):
    result += s[i] / max_num * 100


last = result/n
print("%.2f" % last)
