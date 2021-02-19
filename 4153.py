import sys
def checkRight(listIn):
    if(listIn[0]**2+listIn[1]**2 == listIn[2]**2):
        print("right")
    else:
        print("wrong")
while(True):
    listTemp = list(map(int,sys.stdin.readline().split()))
    if max(listTemp)==0:
        break
    else:
        checkRight(sorted(listTemp))
