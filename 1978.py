import sys

test_case = int(sys.stdin.readline())
num_list = list(map(int, input().split()))
count = 0


def demical_test(a):
    if a < 2:
        return False

    for j in range(2, a):
        if a % j == 0:
            return False

    return True


for i in range(len(num_list)):
    if demical_test(num_list[i]):
        count += 1

print(count)

