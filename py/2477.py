n = int(input())

L=[]
for _ in range(6):
    a, b = map(int,input().split())
    L.append(b)

lmax=max(L[0],L[2],L[4])
cmax=max(L[1],L[3],L[5])

if L[0]==lmax and L[1]==cmax:
    s=L[0]*L[1]-L[3]*L[4]
elif L[2]==lmax and L[1]==cmax:
    s=L[2]*L[1]-L[4]*L[5]
elif L[2]==lmax and L[3]==cmax:
    s=L[2]*L[3]-L[5]*L[0]
elif L[4]==lmax and L[3]==cmax:
    s=L[4]*L[3]-L[0]*L[1]
elif L[4]==lmax and L[5]==cmax:
    s=L[4]*L[5]-L[1]*L[2]
elif L[0]==lmax and L[5]==cmax:
    s=L[5]*L[0]-L[2]*L[3]

print(n*s)
