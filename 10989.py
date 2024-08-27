from sys import stdin, stdout
next(stdin)
cnt=[0]*10001
for num in stdin:
    cnt[int(num)]+=1
for i in range(1,10001):
    stdout.write('{}\n'.format(i)*cnt[i])
