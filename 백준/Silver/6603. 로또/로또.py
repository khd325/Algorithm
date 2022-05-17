import sys


def dfs(idx, depth):
    if depth == 6:
        print(*result)
        return

    for i in range(idx, n):
        result[depth] = array[i]
        dfs(i + 1, depth + 1)


while True:
    array = list(map(int, sys.stdin.readline().split()))

    if array[0] == 0:
        break

    n = array[0]
    result = [0] * 6
    array = array[1:]

    dfs(0, 0)
    print()