import sys

class Solution:

    def __init__(self, n, data):
        self.N = n
        self.DATA = data

    def get_answer(self):
            ret = 1
            for v in self.DATA.values():
                ret *= v + 1
            ret -= 1
            print(ret)


if __name__ == "__main__":
    T = int(sys.stdin.readline().rstrip())
    for _ in range(T):
        N = int(sys.stdin.readline().rstrip())
        IN = {}
        for _ in range(N):
            data = sys.stdin.readline().rstrip().split()
            v = IN.get(data[1])
            if v is None:
                IN.update({data[1]: 1})
            else:
                IN.update({data[1]: v + 1})
        s = Solution(N, IN)
        s.get_answer()

