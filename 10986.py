n,m=map(int,input().split())
x=[0]*m
x[0]=1
a=0
for i in map(int,input().split()):
    a = (a+i)%m
    x[a] +=1
print(sum(i*(i-1) for i in x)//2)
