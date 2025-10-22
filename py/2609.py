numA, numB = list(map(int, input().split()))

def gcd(a, b):
	while True:
		if a < b:
			b, a = a, b

		if a % b == 0: return b
		else:
			a %= b

min = gcd(numA, numB)
max = int(numA * numB / min)
print(min)
print(max)
