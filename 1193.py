num = int(input())
n = 1
ans = 0
while(1):
    if num == 1:
        print(str(1) + '/' + str(1))
        break
    if n*(n+1)/2 >= num:
        ans = num - (n-1)*n/2
        if n%2==0:
            print(str(int(ans)) + '/' + str(int(n-ans+1)))
            break
        else:
            print(str(int(n-ans+1)) + '/' + str(int(ans)))
            break
    n += 1

