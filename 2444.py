import sys
input = sys.stdin.readline

if __name__ == '__main__':
   N = int(input())
   
   for i in range(N-1, -1, -1):
      print(' '*i+'*'*(2*N-2*i-1))

   for i in range(1, N):
      print(' '*i+'*'*(2*N-2*i-1))
