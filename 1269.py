from sys import stdin
#stdin = open("input.txt", "r")
#input = stdin.readline
input = stdin.readline

n = input()
a = input().rstrip().split()
b = input().rstrip().split()

count = len(a + b) - len(set(a + b))

print(len(a) + len(b) - 2 * count)
