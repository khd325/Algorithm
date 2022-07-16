import sys

T = int(sys.stdin.readline())

for _ in range(T):
    n = int(sys.stdin.readline())
    arr = []
    for _ in range(n):
        a, b = map(int, sys.stdin.readline().split())
        arr.append((a, b))

    arr.sort(key=lambda x: (x[0]))
    result = 1
    score = arr[0][1]
    for i in range(1, n):
        if score > arr[i][1]:
            score = arr[i][1]
            result += 1

    print(result)