a=int(input())
A=[]

for _ in range(a):
    mom,key=map(int,input().split())
    A.append((mom,key))

for i in A:
    rank=1
    for j in A:
        if i[0]<j[0] and i[1]<j[1]:
            rank+=1
    print(rank,end=" ")
