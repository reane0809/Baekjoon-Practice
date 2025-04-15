N=int(input())
s=set()
r=set()
result=0
s.add(N)
while 1 not in s:
	result+=1
	k=s.copy()
	for i in k:
		if i%3==0:
			s.add(i//3)
		if i%2==0:
			s.add(i//2)
		s.add(i-1)
		r.add(i)
	s=s-r
print(result)

