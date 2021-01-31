s=input()
croatia=['c=','c-','dz=','d-','lj','nj','s=','z=']
# "dz="를 "z="보다 먼저 배치해야 함.(z=가 dz=에 포함되기 때문에 답이 달라짐)
while True: 
    # input된 문자열 s에 croatia 특수문자가 없을 때 까지 반복하기 위한 while True: 문
    temp=s  # 문자열 s를 temp에 임시로 저장
    for char in croatia:
        if char in temp:         # croatia 특수문자가 temp 문자열에 있다면
            ind=temp.index(char) # temp 문자열에서 croatia 특수문자가 시작하는 인덱스를 ind에 저장
            c=len(char)          # croatia 특수문자의 길이
            temp=temp[:ind]+'/'+temp[ind+c:] 
            # temp에서 ind 전까지의 문자열 + '/' + (ind+c)부터 이후 끝까지의 문자열
            # croatia 특수문자 하나가 '/'로 교체
            break
            # "dz=dz="와 같은 문자열의 경우 break 문이 없으면 "dz="를 찾은 후 남은 "dz="에서 "z=" 찾게되어 오답을 도출함
    if temp!=s: # temp와 s가 같지 않으면 s를 temp와 같게 만들고 while 문 반복
        s=temp
    else:       # temp와 s가 같다면 더 이상 croatia 특수문자가 없으므로 while 문 중지
        break
print(len(s))   # 남아있는 알파벳과 '/'의 개수가 단어의 총 개수
