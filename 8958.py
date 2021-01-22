n=int(input())
number=[]
z=[]

for i in range(1,n+1):
    OX=list(map(str,input()))

    num=0
    su=0
    su1=0
    for j in range(len(OX)):
        k=j+1
        if OX[j] in OX:
         
            if OX[j]=='O':
                num+=1
                su=num
                su1+=su
                
            if OX[j]=='X':
                num=0
    print(su1)
