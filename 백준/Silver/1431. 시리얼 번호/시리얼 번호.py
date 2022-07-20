import sys


def fn(x: str):
    total = 0

    for i in x:
        if i.isdigit():
            total += int(i)

    return total


n = int(sys.stdin.readline())

arr = list()

for _ in range(n):
    arr.append(sys.stdin.readline().rstrip())

arr.sort(key=lambda x: (len(x), fn(x), x))

for i in arr:
    print(i)
