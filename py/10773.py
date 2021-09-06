from sys import stdin

input()
stk = []
for x in map(int, stdin):
    if x:
        stk.append(x)
    else:
        stk.pop()

print(sum(stk))
