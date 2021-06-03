import sys
n = int(sys.stdin.readline())
a=[0]* 1000001 
a[0]=0
a[1]=1
a[2]=2
for i in range(3,n+1):
    a[i] = (a[i-2]+a[i-1])%15746
print(a[n])
