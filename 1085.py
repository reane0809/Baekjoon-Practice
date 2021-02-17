x, y, w, h = map(int,input().split())
k = min(x, w-x, h-y, y)
print(k)
