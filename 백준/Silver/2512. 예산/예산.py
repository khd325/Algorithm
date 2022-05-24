import sys

n = int(sys.stdin.readline())

require = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())

start = 0

end = max(require)

result = 0
while start <= end:
    mid = (start + end) // 2

    temp = 0

    for i in require:
        if mid >= i:
            temp += i
        else:
            temp += mid

    if temp > m:
        end = mid - 1
    else:
        result = mid
        start = mid + 1

print(result)