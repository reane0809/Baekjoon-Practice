import math
from bisect import bisect

primes = list(range(123456*2+1))
primes[1] = 0
for i in range(2, int(math.sqrt(123456*2))+1):
    if primes[i]:
        for j in range(i*i, 123456*2+1, i):
            primes[j] = 0
            
primes = list(filter(None, primes))

N = int(input())        
while(N!=0):
    print(bisect(primes, N*2) - bisect(primes, N))
    N = int(input())
