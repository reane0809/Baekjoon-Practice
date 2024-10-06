n, k = map(int,input().split())

a, b = n, k
for i in range(1, k):
	a *= (n-1)
	n -= 1
	b *= k-1
	k -= 1
if k == 0:
	print(1)
else:
	print((a//b)%10007)

