import sys
input=sys.stdin.readline
d={}
for i in range(int(input())):
    d[i]=list(map(int,input().split()))
    if i:
        temp=d[i][:]
        d[i][0]=min(d[i-1][1],d[i-1][2])
        d[i][0]+=temp[0]
        d[i][1]=min(d[i-1][0],d[i-1][2])
        d[i][1]+=temp[1]
        d[i][2]=min(d[i-1][0],d[i-1][1])
        d[i][2]+=temp[2]
print(min(d[i]))
