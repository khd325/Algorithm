import sys

n, m = map(int, sys.stdin.readline().split())
array = list(map(int, sys.stdin.readline().split()))

start = 1
end = max(array)

while start <= end:
    mid = (start + end) // 2
    total = 0

    for i in array:
        if i > mid:
            total += i - mid

    if total >= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)