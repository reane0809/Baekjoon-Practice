import sys

sys.setrecursionlimit(99999)

arr = []

def quick_sort(left, right):
    i = left
    j = right-1
    pivot = arr[right]
    if left >= right:
        return
    while i <= j:
        while arr[i] < pivot:
            i += 1
        while arr[j] > pivot:
            j -= 1
        if i >= j:
            break
        tmp = arr[i]
        arr[i] = arr[j]
        arr[j] = tmp
        i += 1
        j -= 1
    arr[right] = arr[i]
    arr[i] = pivot
    quick_sort(left, i-1)
    quick_sort(i+1, right)
    
n = int(input())
for i in range(n):
    arr.append(int(input()))
quick_sort(0, n-1)
for i in range(n):
    print(arr[i])

