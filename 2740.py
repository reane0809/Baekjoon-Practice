def matrix_mul(a, b):
    result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                result[i][j] += a[i][k] * b[k][j]
    return result


def get_matrix():
    row, column = map(int, input().split())
    matrix = [[int(i) for i in input().split()] for _ in range(row)]
    return matrix


x = get_matrix()
y = get_matrix()

answer = matrix_mul(x, y)
for i in range(len(answer)):
    for j in range(len(answer[0])):
        print(answer[i][j], end=' ')
    print()

