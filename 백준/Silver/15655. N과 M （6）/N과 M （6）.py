import sys


def dfs(start, depth):
    if depth == m:
        print(*result)
        return

    for i in range(start, n):
        result[depth] = li[i]
        dfs(i + 1, depth + 1)


n, m = map(int, sys.stdin.readline().split())

li = list(map(int, sys.stdin.readline().split()))

li.sort()

result = [0] * m

dfs(0, 0)
