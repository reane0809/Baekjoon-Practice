for __ in range(int(input())):
 n=int(input())
 sx,sy=map(int,input().split())
 ex,ey=map(int,input().split())
 if sx>ex:(sx,sy),(ex,ey)=(ex,ey),(sx,sy)
 if sy>ey:sy=(n-1)-sy;ey=(n-1)-ey
 dx,dy=ex-sx,ey-sy
 if dx>dy:sx,sy=sy,sx;ex,ey=ey,ex;dx,dy=dy,dx
 ans=max((dy+1)//2,(dx+dy+2)//3)
 ans+=dx+dy+ans&1
 d=dx,dy
 if d==(0,1):ans=3
 elif d==(0,3):
  if n==4 and sx in(0,3):ans=5
  else:ans=3
 elif d==(1,1):
  m1x,m1y=sx+2,sy-1
  m2x,m2y=sx-1,sy+2
  if 0<=m1x<n>m1y>=0 or 0<=m2x<n>m2y>=0:ans=2
  else:ans=4
 elif d==(2,2):ans=4
 print(ans)
