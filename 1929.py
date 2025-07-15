def GetPrime(n): 
    if n < 2:
        return []
    n += 1
    save = [1] * (n // 2)
    for i in range(3, int(n ** 0.5) + 1, 2):
        if save[i // 2]:
            k = i * i
            save[k // 2::i] = [0] * ((n - k - 1) // (2 * i) + 1)
    return [2] + [(2 * i + 1) for i in range(1, n // 2) if save[i]]


n,m=map(int, input().split())
p = GetPrime(m)
for i in range(len(p)):
    if p[i] >= n:
        for j in p[i:]:
            print(j)
        break

