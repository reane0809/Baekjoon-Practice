from sys import stdin, stdout
li = stdin.read().split()[1:]
li = sorted(li, key=int)
stdout.write('\n'.join(li))

