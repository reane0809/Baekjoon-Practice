a = input().split(' ')
b = a[0]
c = a[1]

b1 = int(b[2])*100+int(b[1])*10+int(b[0])
c1 = int(c[2])*100+int(c[1])*10+int(c[0])

if b1>c1:
    print(b1)
else: print(c1) 
