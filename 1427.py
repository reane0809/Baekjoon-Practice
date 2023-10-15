n = int(input())
list1=[]

while(n!=0):
    list1.append(n%10)
    n=n//10

x=sorted(list1)
for i in range(len(x)):
    n=n+x[i]*pow(10,i)

print(n)
