import sys
A = int(sys.stdin.readline())
count = 0
while A > 0:
    if A%5 != 0:
        A -= 3
        if A<0:
            count = -1
            break
        count += 1
    elif A%5 == 0:
        A = A-5
        count += 1
    elif A%3 != 0:
        count = -1
print(count)
