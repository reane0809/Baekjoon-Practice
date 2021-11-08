import sys
input=sys.stdin.readline
while True:
  n=list(map(int,input().split()))+[0]
  N=n[0]
  if N==0:
    break
  arr=[(1,n[1])]
  answer=0
  for i in range(2,N+2):
    cur=i
    while arr and arr[-1][1]>n[i]:
      cur,h=arr.pop()
      answer=max(answer,(i-cur)*h)
    arr.append((cur,n[i]))
  print(answer)
