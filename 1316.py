T = int(input())
cnt = 0
for i in range(T):
    word = input()
    for j in range(len(word) - 1):
        if word.find(word[j]) > word.find(word[j + 1]):
            cnt += 1
            break

print(T - cnt)
