a = list(input())
new = []
for i in a:
    if i not in new:
        new.append(i)
    else:
        new.append(0) 
b = [-1] * 26
c = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
for i in range(len(new)):
    if new[i] != 0:
        d = c.index(new[i])
        b[d] = i
for i in range(len(b)):
    print(b[i] ,end=" ")
