import sys
input = sys.stdin.readline

def gcd(n, m):
	while n % m != 0:
		r = n % m
		n = m
		m = r
	return m

def get_divisior(n):
	result = set()
	for i in range(1, int(n**(0.5)) + 1):
		if n % i == 0:
			result.add(i)
			result.add(n//i)
	return result

if __name__ == '__main__':
	N = int(input())
	nums = sorted([int(input()) for _ in range(N)])
	nums_ = sorted([nums[i+1] - nums[i] for i in range(N-1)])
	if len(nums) > 2:
		g = gcd(nums_[1], nums_[0])
		for i in range(2, N-1):
			g = gcd(nums_[2], g)
	else:
		g = nums[1] - nums[0]

	ans = sorted(get_divisior(g))
	print(' '.join(map(str, ans[1:])))
