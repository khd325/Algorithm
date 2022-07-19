import sys


def bs(start, end, target):
    result = -1

    while start <= end:
        mid = (start + end) // 2

        if a[mid] == target:
            result = mid
            end = mid - 1

        elif a[mid] > target:
            end = mid - 1

        elif a[mid] < target:
            start = mid + 1

    return result


n, m = map(int, sys.stdin.readline().split())

a = []

for _ in range(n):
    a.append(int(sys.stdin.readline()))

a.sort()

for _ in range(m):
    print(bs(0, n - 1, int(sys.stdin.readline())))
