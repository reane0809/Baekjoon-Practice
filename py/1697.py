def F(N,K):
    if N>=K:return N-K
    elif K==1:return 1
    elif K%2:return min(F(N,K-1),F(N,K+1))+1
    else:return min(K-N,F(N,K//2)+1)
N,K=map(int,input().split())
print(F(N,K))
