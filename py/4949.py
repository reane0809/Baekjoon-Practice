from sys import stdin
def sol():
    letters = list()
    while(True):
        temp = stdin.readline()[:-1]
        if(temp == '.'):
            break
        else:
            letters.append(temp)
    for item in letters:
        print(check(item))
def check(letters):
    stack = list()
    for item in letters:
        if(item =="(" or item =="["):
            stack.append(item)
        elif(item ==")"):
            if(stack):
                if(stack.pop() != "("):
                    return "no"
            else:
                return "no"
        elif(item == "]"):
            if (stack):
                if (stack.pop() != "["):
                    return "no"
            else:
                return "no"
    if(stack):
        return "no"
    return "yes"
if __name__ == "__main__":
    sol()
