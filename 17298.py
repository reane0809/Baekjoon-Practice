N = int(input())

arr = list(map(int, input().split(" ")))
result = ["-1" for _ in range(N)]
stack = []

stack.append(0)
i = 0

for i in range(N):
    while stack and arr[stack[-1]] < arr[i]:
        result[stack[-1]] = str(arr[i])
        stack.pop()
        
    stack.append(i)
    i += 1
    
print(' '.join(result))
