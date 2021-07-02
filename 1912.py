input()
l = [*map(int,input().split())]

if max(l) <= 0: print(max(l))
else:
	s = 0
	m = 0

	for a in l:
		s += a
		if s < 0:
			s = 0
		if m < s:
			m = s

	print(m)
