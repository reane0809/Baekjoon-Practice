n, m = map(int, input().split())

cards = list(map(int, input().split()))

cards.sort(reverse = True)

max_sum = 0
for i in range(0, n - 2):
    if cards[i] > m:
        continue
    
    maxsum2 = 0
    for j in range(i + 1, n - 1):
        sum2 = cards[i] + cards[j]
        
        if sum2 > m:
            continue
        
        maxsum3 = 0
        for k in range(j + 1, n):
            sum3 = cards[i] + cards[j] + cards[k] 
            if sum3 == m:
                maxsum3 = m
                break
            elif sum3 < m:
                if maxsum3 < sum3:
                    maxsum3 = sum3
                    break
        if maxsum3 == m:
            maxsum2 = m
            break
        elif maxsum3 > maxsum2:
            maxsum2 = maxsum3
    if maxsum2 == m:
        max_sum = m
        break
    elif max_sum < maxsum2:
        max_sum = maxsum2

print(max_sum)
