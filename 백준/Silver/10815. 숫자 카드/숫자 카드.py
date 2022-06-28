import sys

def bs(target):
    start = 0
    end = len(has) - 1

    while start <= end:
        mid = (start + end) // 2

        if has[mid] == target:
            return True
        elif has[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    return False



n = int(sys.stdin.readline())
has = list(map(int,sys.stdin.readline().split()))

has.sort()

m = int(sys.stdin.readline())

find = list(map(int,sys.stdin.readline().split()))

result = []
for i in range(m):
    if bs(find[i]):
        result.append(1)
    else:
        result.append(0)


print(*result)