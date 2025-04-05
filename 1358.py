from sys import stdin
w, h, x, y, p = list(map(int, stdin.readline().rstrip().split()))

players = [
    list(map(int, stdin.readline().rstrip().split())) for _ in range(p)
]
r = h / 2


def isIn(px, py):
    if px >= x and px <= x + w and py >= y and py <= y + h:
        return True
    # 왼쪽 원 계산
    pw_l = abs(x - px) ** 2
    ph_l = abs(y+r - py) ** 2
    rr = r ** 2

    if pw_l + ph_l <= rr:
        return True

    pw_r = abs(px - (x + w)) ** 2
    ph_r = abs(py - (y + r)) ** 2

    if pw_r + ph_r <= rr:
        return True
    return False

data = list(filter(lambda e: isIn(e[0], e[1]), players))
print(len(data))

