s = int(input())
nlist = []
n = 0
while len(nlist) <= 10000:
    if not n%10 == 6:
        nlist.append(n*1000+666)

    elif (n//10)%100 == 66:
        for k in range (1000):
            nlist.append(n*1000+k)

    elif (n//10)%10 == 6:
        for j in range (100):
            nlist.append(n*1000+600+j)

    elif n%10 == 6:
        for i in range (10):
            nlist.append(n*1000+660+i)

    n += 1

print (nlist[s-1])
