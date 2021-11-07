import sys
input = sys.stdin.readline
basis = [[1, 1], [1, 0]]
def mat_multiple(a, b):
    c = [[0, 0], [0, 0]]
    if b == 1:
        return a
    else:
        for i in range(2):
            for j in range(2):
                for k in range(2):
                    c[i][j] += (a[i][k] * b[k][j])
                c[i][j] %= 1000000007
        return c

def mat_expon(mat, num):
    ans = [[1, 0], [0, 1]]
    if num == 0:
        return ans
    elif num == 1:
        return mat
    else:
        while num > 0:
            if num % 2 == 1:
                ans = mat_multiple(mat, ans)
            mat = mat_multiple(mat, mat)
            num = num // 2
    return ans
            

num = int(input())
print(mat_expon(basis, num)[0][1] % 1000000007)
