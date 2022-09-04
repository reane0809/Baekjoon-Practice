x=int(input())
s=0
for i in range(int(input())):
    a,b=map(int,input().split())
    s+=a*b
print("Yes" if x==s else "No")
