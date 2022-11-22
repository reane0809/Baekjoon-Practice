A, B = [], []    ##리스트

N, M = map(int, input().split())    ##행렬크기

for row in range(N):        ##값 입력
    row = list(map(int, input().split()))
    A.append(row)

for row in range(N):
    row = list(map(int, input().split()))
    B.append(row)
    
for row in range(N):        ##더하기
    for col in range(M):
        print(A[row][col] + B[row][col], end=' ')
    print()
