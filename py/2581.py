import math

x = int(input())
y = int(input())

sum = 0
min = y
for i in range(x, y+1):  # x이상 y이하의 수 i 중에
    prime = True
    for j in range(2, int(math.sqrt(i)) + 1):  # 2이상 루트 i 이하 수들로
        if i % j == 0:  # 단한번이라도 나누어 떨어지면
            prime = False  # i는 소수가 아니라고 표시
    if (prime and i != 1) or i == 2:  # 소수일 조건
        sum += i
        if i < min:
            min = i


if sum == 0:
    sum = -1
    print(sum)

else:
    print(sum)
    print(min)
