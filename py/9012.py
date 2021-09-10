import sys

t = int(sys.stdin.readline())

for _ in range(t):
	n = list(sys.stdin.readline().rstrip())
	cal = []
	cnt = 1

	for i in range(len(n)):
		temp = n.pop()
		if temp == ')':
			cal.append(temp)
		else:
			if len(cal)!=0:
				cal.pop()
			else:
				cnt = 0
				break
	if len(cal) !=0:
		cnt = 0
	if cnt:
		print('YES')
	else:
		print('NO')
