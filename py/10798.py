l = []
for i in range(5):
    l.append(input())

for j in range(15):
    for i in range(5):
        try:
            print(l[i][j], end='')
        except:
            pass
