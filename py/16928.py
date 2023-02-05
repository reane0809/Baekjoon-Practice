def solution(SL):
    visited=[1]
    stack=[1]
    answer=0
    while 1:
        t_stack=[]
        while stack:
            s=stack.pop()
            for k in range(1,7):
                temp=k+s
                if temp not in visited:
                    if temp in SL:
                        visited.append(temp)
                        visited.append(SL[temp])
                        t_stack.append(SL[temp])
                    else:
                        visited.append(temp)
                        t_stack.append(temp)
        stack=t_stack
        answer+=1
        if 100 in visited:
            break
    return answer
            
n=input()
n=n.split()
SL={}
for i in range(int(n[0])+int(n[1])):
    s = list(map(int, input().split()))
    SL[s[0]]=s[1]
print(solution(SL))
