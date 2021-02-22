listfac = [1]*13

def fact(a):
    if a == 0:
        return 1
    if a == 1:
        return 1
    if listfac[a] != 1:
        return listfac[a]
    else:
        listfac[a] = a * fact(a-1)
        return listfac[a]

n = int(input())
print(fact(n))
