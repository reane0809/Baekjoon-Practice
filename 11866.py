n,k = map(int,input().split())
li=list(range(1,n+1))
i=0;s=[]
while (len(li)!=0):
    i+=k-1
    if len(li)<=i:
        i=i%len(li)
    s.append(li.pop(i))
print('<'+str(s)[1:-1]+'>')

