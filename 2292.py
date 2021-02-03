N = int(input())
k = (N-2)//6
num = 0
res = 0
for i in range(N//2+1):
    num += i
    if k < num:
        res = i+1
        break

print(res)
