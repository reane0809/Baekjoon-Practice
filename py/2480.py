a=list(map(int,input().split()));r=0
for i in a:
 k=a.count(i)
 if k>1:r=(10+i)
if r==0:r=max(a)
print(r*100*(10**(k>2)))
