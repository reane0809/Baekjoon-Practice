input();n=list(map(int,input().split()))
for i in range(1,len(n)):
 a,b=n[0],n[i]
 while b:a,b=b,a%b
 print(n[0]//a,'/',n[i]//a,sep='')
