import sys


def dfs(depth):
    if depth == n:
        print(*array)
        return

    for i in range(1, n + 1):
        if not visited[i]:
            visited[i] = True
            array[depth] = i
            dfs(depth + 1)
            visited[i] = False


n = int(sys.stdin.readline())

visited = [False] * (n + 1)
array = [0] * n
dfs(0)
