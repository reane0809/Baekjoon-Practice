from sys import stdin, stdout

cnt, tc = map(int, input().split())
monster_dict = dict()
monster_dict_key_reverse = dict()

buffer = stdin.read().split()
total = buffer[:cnt]
quiz = buffer[cnt:]
ans = []

for i in range(cnt):
    monster_dict[i+1] = total[i]
    monster_dict_key_reverse[total[i]] = i+1

for i in range(tc):
    each = quiz[i]
    if each.isdigit():
        ans.append(monster_dict[int(each)])
    else:
        ans.append(str(monster_dict_key_reverse[each]))
print('\n'.join(ans))
