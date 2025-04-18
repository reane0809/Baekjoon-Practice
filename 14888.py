def sol(p,m,x,d,idx,result):
    global min_ans
    global max_ans
    if idx >= n:
        if result < min_ans:
            min_ans = result
        if result > max_ans:
            max_ans = result
        return
    
    if p > 0:
        tmp_result = result + a[idx]
        sol(p-1, m,x,d,idx+1,tmp_result)
    if m > 0:
        tmp_result = result - a[idx]
        sol(p,m-1,x,d,idx+1,tmp_result)
    if x > 0:
        tmp_result = result * a[idx]
        sol(p,m,x-1,d,idx+1,tmp_result)
    if d > 0:
        if result < 0:
            tmp_result = -(abs(result) // a[idx])
        else:
            tmp_result = result // a[idx]
        sol(p,m,x,d-1,idx+1, tmp_result)
    

n = int(input())
a = list(map(int, input().split()))
ops = list(map(int, input().split()))

max_ans = -1e9
min_ans = 1e9

sol(ops[0],ops[1],ops[2],ops[3], 1, a[0])


print(max_ans)
print(min_ans)

