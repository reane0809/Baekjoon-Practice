import itertools

n, m = map(int, input().split())

pool = [str(i) for i in range(1, n+1)]

print('\n'.join(list(map(' '.join, itertools.permutations(pool, m)))))   

