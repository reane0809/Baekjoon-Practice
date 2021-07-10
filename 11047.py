N,K=map(int,input().split());a=[]
for i in range(0,N):
    a.append(int(input()))
a.sort(reverse=True)
count=0
for i in a:
    if K>=i:
        count+=K//i
        K-=i*(K//i)
print(count,end='')
