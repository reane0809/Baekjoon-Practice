import sys

input = sys.stdin.readline

def Test():
    n,tmp,m = input(),set(input().split()),input()
    res = ""
    for i in input().split():
        if i in tmp:
            res +="1 "
        else:
            res +="0 "
    print(res)
Test()
