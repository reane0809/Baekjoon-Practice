import sys
read = sys.stdin.readline


def dp(n, k):
    dp_dict = {0: 0}
    for _ in range(n):
        new_w, new_v = map(int, read().split())
        temp = {}
        for acc_w, acc_v in dp_dict.items():
            if acc_w + new_w <= k and acc_v + new_v > dp_dict.get(acc_w + new_w, 0):
                temp[acc_w + new_w] = acc_v + new_v
        dp_dict.update(temp)
    return max(dp_dict.values())


N, K = map(int, read().split())
print(dp(N, K))

