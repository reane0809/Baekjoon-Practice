import sys

boys = [i for i in range(1, 31)]
good_boys = [int(sys.stdin.readline()) for _ in range(28)]

print("\n".join([str(bad_boy) for bad_boy in boys if bad_boy not in good_boys]))
