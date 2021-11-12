from collections import deque, defaultdict
from math import floor, sqrt
import sys
In = sys.stdin.readline

def closest_distance_squared(ps, n):
    ps = sorted(ps, key=lambda z: z.real)
    
    xmin, xmax = ps[0].real, ps[-1].real
    ymin, ymax = min(z.imag for z in ps), max(z.imag for z in ps)
    d = sqrt((xmax-xmin)**2 + (ymax-ymin)**2) / floor(sqrt(n-1))
    
    d2 = min(abs(ps[i] - ps[i+1]) for i in range(n-1))
    if round(d**2) in [0,1]: return round(d**2)
    if d2 < d: d = d2
    
    layerindex = [int(z.imag // d) for z in ps]
    candidate = defaultdict(deque)
    
    i = 0
    for j, p in enumerate(ps):
        while i < j and p.real - ps[i].real > d:
            candidate[layerindex[i]].popleft()
            i += 1
        h = layerindex[j]
        for h in (h-1, h, h+1):
            d3 = min((abs(p-q) for q in candidate[h]), default=2e30)
            if d3 < d: d = d3
        candidate[layerindex[j]].append(p)
    return round(d**2)

def main():
    n = int(In())
    ps = [complex(*map(int, In().split())) for _ in range(n)]
    print(closest_distance_squared(ps, n))
main()
