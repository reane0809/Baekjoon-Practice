t = int(input())
for i in range(t):
    c, s = input().split()
    c = int(c)
    for sp in s:
        print(sp*c,end='')
    print(" ")
