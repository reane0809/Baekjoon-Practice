a,b=map(int,input().split())
c=(a*60+b+int(input()))%1440
print(c//60,c%60)
