number = int(input())
e = 0
for i in range(number):
    result = 0
    a = list(map(int, input().split()))
    a.pop(0)
    q = sum(a) / len(a)
    for j in range(0, len(a)):
        if a[j] > q:
            result += 1
        e = 100 / len(a) * result
    print("{0:.3f}%".format(round(e, 3)))
