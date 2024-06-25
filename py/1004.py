import sys
for i in range(int(sys.stdin.readline())):
    cnt=0
    x1,y1,x2,y2 = map(int, sys.stdin.readline().split())
    for n in range(int(sys.stdin.readline())):
        cx, cy, r = map(int, sys.stdin.readline().split())
        if (r**2 > (x1-cx)**2+(y1-cy)**2) != (r**2 > (x2-cx)**2+(y2-cy)**2):
            cnt += 1
    print(cnt)
