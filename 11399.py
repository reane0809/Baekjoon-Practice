import sys

number_of_people = int(sys.stdin.readline())
waiting_time = list(map(int, sys.stdin.readline().split()))
waiting_time = sorted(waiting_time, key=lambda x: x)

total_time = 0
accumulated_time = 0
for i in range(len(waiting_time)):
    accumulated_time += waiting_time[i]
    total_time += accumulated_time

print(total_time)

