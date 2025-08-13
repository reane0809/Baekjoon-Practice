import sys

T = int(sys.stdin.readline())
for t in range(T):
    M,N = list(map(int,sys.stdin.readline().split()))
    info = list(map(int,sys.stdin.readline().split()))

    if info.count(info[N]) == 1:
        print(sorted(info, reverse = True).index(info[N])+1)
    else:
        temp = sorted(info, reverse = True)
        
        target = info[N]
        info[N] = 0

        prior = temp.index(target)

        answer = prior
        for i in range(prior):
            index = info.index(temp[i])
            info.pop(index)
            info = info[index:] + info[:index]
        for j in range(M-prior):
            if (info.count(target) != 0) and (info.index(target) < info.index(0)):
                answer += 1
                info.remove(target)
            else:
                break
        answer += 1
        print(answer)

