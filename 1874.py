import sys
In = sys.stdin.readline
Out = sys.stdout.write

def produce(seq):
    cur = 1
    stack = [0]
    result = ''
    for x in seq:
        while cur <= x:
            stack.append(cur)
            result += '+\n'
            cur += 1
        if stack.pop() != x:
            Out("NO\n")
            return
        else:
            result += '-\n'
    Out(result)

def main():
    n = int(In())
    seq = [int(In()) for x in range(n)]
    produce(seq)

main()

