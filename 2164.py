import sys

if __name__ == "__main__":
    input = sys.stdin.readline
    n = int(input())
    if(n==2 or n==1):
        print(n)
    else:
        x = 0
        while 2**x < n:
            x += 1
        y = n - 2**(x-1)
        print(2*y)

