import math


def get_prime(N):
    max_length = math.ceil(math.sqrt(N))
    for k in range(2, max_length):
        if prime_number[k]:
            for i in range(k + k, N + 1, k):
                prime_number[i] = False
#입력값 N까지의 소수에 해당하는 index를 True로.

def find_partition(prime_number_list, N):
    i = int(N / 2)
    if prime_number_list[i]:
        return i
    else:
        for j in range(i, 1, -1):
            M = N - j
            if prime_number_list[j] and prime_number_list[M]:
                return j
#입력값 N을 기준으로 반을 나눠서 True의 값을 가지는 index를 찾고 partition을 구함.

T = int(input())
for k in range(T):
    n = int(input())
    if n % 2 == 0 and n > 2:
        prime_number = [True] * (n + 1)
        prime_number[0] = False
        prime_number[1] = False
        get_prime(n)
        X = find_partition(prime_number, n)
        print(X, n - X)
