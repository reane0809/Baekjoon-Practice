from sys import stdin
def dsum(num):
    psum = sum(map(int, str(num))) # 각 자리수의 합
    return psum + num # 부분합 구하기

m = int(stdin.readline().strip()) # 부분합 받기
for i in range(1, m): # 1부터 부분합보다 작은 값에서 생성자 찾기
    if dsum(i) == m : # 생성자 찾는 부분
        print(i)
        break 
else: # 마지막까지 안되면 생성자가 없으므로 0 출력
    print(0)
