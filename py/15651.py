import sys
n, m = map(int,sys.stdin.readline().split())

def backtracking(num):
    global l
    if num > n:
        str1 = ""
        for i in range(len(l)):
            if i == len(l) - 1:
                str1 = str1 + str(l[i])
            else:
                str1 = str1 + str(l[i]) + " "
        print(str1)
    else:
        for i in range(1,n+1):
            l = l[:num-1]
            if len(l) >= m:
                str1 = ""
                for i in range(len(l)):
                    if i == len(l)-1:
                        str1 = str1 + str(l[i])
                    else:
                        str1 = str1 + str(l[i]) + " "
                print(str1)
                break
            l.append(i)
            # if isPossible(num):
            backtracking(num + 1)
            # else:
            #     l.pop()

def isPossible(num):
    for i in range(num-1):
        if l[i] == l[num-1]:
            return False
    return True

for i in range(1,n+1):
    l = []
    l.append(i)
    backtracking(2)
