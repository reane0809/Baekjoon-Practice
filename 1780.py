import sys

N = int(sys.stdin.readline().rstrip())
arr = [[0 for i in range(N)] for j in range(N)]
for n in range(N):
    it = sys.stdin.readline().rstrip().split(' ')
    for i in range(N):
        arr[n][i] = int(it[i])+2

def devide(arr, i, j, len):
    if len == 1:
        rst = [arr[i][j],0,0,0]
        rst[arr[i][j]] = 1
        return rst
    l1 = len//3
    l2 = l1*2
    candidate = [(0,0),(0,l1),(0,l2),(l1,0),(l1,l1),(l1,l2),(l2,0),(l2,l1),(l2,l2)]

    d = []
    for c in candidate:
        d.append(devide(arr,i+c[0],j+c[1],l1))

    cnt = [0,0,0,0]
    rst = [0,0,0,0]
    for k in d:
        cnt[k[0]] +=1
        rst[1] += k[1]
        rst[2] += k[2]
        rst[3] += k[3]
    
    if cnt[1] == 9 or cnt[2] == 9 or cnt[3] == 9:
        rst = [arr[i][j],0,0,0]
        rst[arr[i][j]] = 1
        return rst
    else :
        return rst

rst = devide(arr,0,0,N)
print(rst[1])
print(rst[2])
print(rst[3])
