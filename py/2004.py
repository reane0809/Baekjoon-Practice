def calx(n, x):
	s = 0
	while n:
		n //= x
		s += n
	return s
def cal0(n, m):
	f = calx(n, 5)-calx(m, 5)-calx(n-m, 5)
	t = calx(n, 2)-calx(m, 2)-calx(n-m, 2)
	return min(f, t)
n, m = map(int, input().split())
print(cal0(n, m))
