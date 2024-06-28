import sys
Deque=[]
for _ in range(int(input())):
    line=sys.stdin.readline().split()
    if line[0]=='push_front':
        Deque=[int(line[1])]+Deque
        
    elif line[0]=='push_back':
        Deque=Deque+[int(line[1])]
      
    elif line[0]=='pop_front':
        if Deque==[]:print(-1)
        else : print(Deque.pop(0))
    
    elif line[0]=='pop_back':
        if Deque==[]:print(-1)
        else : print(Deque.pop())
  
    elif line[0]=='size':
        print(len(Deque))
        
    elif line[0]=='empty':
        if Deque==[]:print(1)
        else : print(0)
        
    elif line[0]=='front':
        if Deque==[]:print(-1)
        else : print(Deque[0])
 
    elif line[0]=='back':
        if Deque==[]:print(-1)
        else : print(Deque[-1])
